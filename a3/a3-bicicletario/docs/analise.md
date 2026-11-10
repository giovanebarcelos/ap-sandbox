# Análise do Problema — Bicicletário do Campus

## 1. O problema

O campus tem um bicicletário com 40 vagas, controlado hoje num caderno. Não se sabe quantas vagas estão livres, a cobrança depois de 3 horas é feita "de cabeça" (e cada funcionário calcula de um jeito) e quem esquece a bicicleta por dias seguidos ocupa vaga de quem precisa.

O sistema é usado pelo **funcionário da portaria** num terminal: cadastra os ciclistas, registra entradas e saídas, calcula o valor a pagar e mostra a ocupação do bicicletário.

## 2. Funcionalidades (menu)

| # | Funcionalidade | Entradas | Saídas |
|---|---|---|---|
| 1 | Cadastrar ciclista | nome, matrícula | confirmação ou o motivo da recusa |
| 2 | Registrar entrada | matrícula, código do lacre da bicicleta, cor, dia da semana, turno | número da vaga ocupada ou o motivo da recusa |
| 3 | Registrar saída e calcular valor | número da vaga, minutos estacionado | valor a pagar (e aviso de atraso, se houver) |
| 4 | Mapa de ocupação | — | tabela dia da semana × turno com o número de entradas |
| 5 | Relatório | — | ciclistas cadastrados, bicicletas presentes, usos encerrados, total arrecadado, horário mais movimentado |
| 6 | Carregar dados de exemplo | — | 3 ciclistas e 2 bicicletas **fictícios**, para a demonstração |
| 0 | Sair | — | — |

## 3. Regras de negócio

| Regra | Descrição | Limite exato |
|---|---|---|
| **R1** | Permanência curta é grátis | **até 180 min, inclusive**, o valor é R$ 0,00 |
| **R2** | Acima do limite grátis, paga-se R$ 2,00 por **hora iniciada** além dos 180 min, com teto de R$ 10,00 | 181 min → R$ 2,00 · 240 → R$ 2,00 · 241 → R$ 4,00 · 421 → R$ 10,00 (teto) |
| **R3** | O bicicletário tem 40 vagas; com todas ocupadas, a entrada é recusada | a 40ª bicicleta entra; a 41ª é recusada |
| **R4** | Permanência **acima de 12 h** (720 min) conta um atraso; com **3 atrasos** o ciclista fica bloqueado e não registra novas entradas | 720 min não conta; 721 conta · 2 atrasos entra; 3 atrasos não entra |
| **R5** | Um ciclista só pode ter **uma** bicicleta no bicicletário por vez, e a mesma bicicleta (código do lacre) não entra duas vezes | — |
| **R6** | A matrícula tem **exatamente 6 dígitos** e não se repete; o nome tem de 2 a 60 caracteres | 5 ou 7 dígitos, ou letra na matrícula, são recusados |

**Validações de entrada:** permanência de 0 a 1440 min (um dia); dia da semana de 0 a 6; turno de 0 a 2; número da vaga de 1 a 40; opção do menu de 0 a 6. Letra no lugar de número é recusada e a pergunta se repete.

## 4. Dicionário de dados (rota orientada a objetos)

Os limites das regras são **constantes** (`static final`), nunca números soltos no código.

### Constantes

| Constante | Classe | Tipo | Valor | Regra |
|---|---|---|---|---|
| `LIMITE_GRATIS_PADRAO_MIN` | `Tarifa` | `int` | 180 | R1 |
| `VALOR_HORA_PADRAO` | `Tarifa` | `double` | 2.0 | R2 |
| `TETO_PADRAO` | `Tarifa` | `double` | 10.0 | R2 |
| `PERMANENCIA_MAXIMA_MIN` | `Tarifa` | `int` | 1440 | validação |
| `CAPACIDADE_PADRAO` | `Bicicletario` | `int` | 40 | R3 |
| `MAX_CICLISTAS` | `Bicicletario` | `int` | 100 | capacidade do cadastro |
| `LIMITE_ATRASO_MIN` | `Uso` | `int` | 720 | R4 |
| `MAX_ATRASOS` | `Ciclista` | `int` | 3 | R4 |
| `TAMANHO_MATRICULA` | `Ciclista` | `int` | 6 | R6 |

### Classes e atributos

| Classe | Atributo | Tipo | Observação |
|---|---|---|---|
| `Ciclista` | `matricula` | `String` | `final`, sem setter: identifica o ciclista |
| | `nome` | `String` | setter valida 2 a 60 caracteres |
| | `atrasos` | `int` | **sem setter**: só aumenta por `registrarAtraso()` |
| `Bicicleta` | `codigo` | `String` | `final`; código do lacre, em maiúsculas |
| | `cor` | `String` | setter recusa cor vazia |
| | `dono` | `Ciclista` | associação |
| `Vaga` | `numero` | `int` | `final` |
| | `ocupada` | `boolean` | **sem setter**: muda só por `ocupar()` e `liberar()` |
| `Tarifa` | `limiteGratisMin`, `valorPorHora`, `teto` | `int`, `double`, `double` | `final`; definidos no construtor |
| `Uso` | `ciclista`, `bicicleta`, `vaga` | objetos | associações |
| | `diaSemana`, `turno` | `int` | 0-6 e 0-2 |
| | `aberto`, `minutos`, `valor` | `boolean`, `int`, `double` | mudam só por `encerrar()` |
| `Bicicletario` | `vagas` | `ArrayList<Vaga>` | **composição**: criadas no construtor |
| | `ciclistas`, `usos` | `ArrayList<Ciclista>`, `ArrayList<Uso>` | associação |
| | `tarifa` | `Tarifa` | tabela de preços em uso |
| | `ocupacao` | `int[7][3]` | **matriz** dia da semana × turno |

## 5. Decisões de modelagem

| Decisão | Por quê |
|---|---|
| `Bicicletario` → `Vaga` é **composição** | As vagas são criadas no construtor do bicicletário e não existem fora dele. Se o bicicletário deixa de existir, as vagas também |
| `Bicicleta` → `Ciclista` é **associação** | O ciclista existe sem a bicicleta, e a bicicleta continua existindo se o ciclista sair do cadastro |
| `Uso` liga `Ciclista`, `Bicicleta` e `Vaga` por **associação** | O uso é um registro do que aconteceu; nenhum dos três depende dele para existir |
| `Tarifa` é um objeto, não só constantes | Permite criar um bicicletário com outra tabela de preços (os testes usam um com 2 vagas e outra tarifa) sem mexer no cálculo |
| Erros viram **códigos de retorno** (`ERRO_*`), não exceções | Exceções são da Aula 33, depois do conteúdo da A3. O `Main` traduz o código numa mensagem com `switch` |
| `getOcupacao()` devolve **uma cópia** da matriz | Devolver a própria matriz deixaria o `Main` alterar a estatística por fora — o mesmo motivo de os atributos serem `private` |

## 6. Fora do escopo

- **Horário real de entrada e saída:** a portaria informa os minutos estacionados. Usar o relógio do computador complicaria os testes e não acrescenta nenhuma estrutura do conteúdo da A3.
- **Gravar em arquivo ou banco de dados:** os dados vivem em memória enquanto o programa roda.
- **Pagamento:** o sistema calcula o valor; a cobrança é feita fora dele.
- **Desbloqueio de ciclista:** é decisão da administração, fora do sistema da portaria.
