# Bicicletário do Campus — Projeto de Exemplo da A3

> **Projeto de referência da A3 de Algoritmos e Programação**, feito pelo professor para mostrar **o formato e o nível esperados** de uma entrega. É um guia de estrutura, não um código para copiar: **este tema não vale como A3**.

Sistema de terminal para a portaria do bicicletário do campus: cadastra ciclistas, registra entradas e saídas, calcula o valor a pagar (até 3 h grátis; depois R$ 2,00 por hora iniciada, com teto de R$ 10,00), bloqueia quem deixa a bicicleta mais de 12 h por 3 vezes e mostra a ocupação por dia da semana × turno.

**Rota:** orientada a objetos (a recomendada) · **Linguagem:** Java 17+ · **Build e testes:** Maven + JUnit 5

| Documento | Conteúdo |
|---|---|
| [`docs/analise.md`](docs/analise.md) | Problema, funcionalidades, regras R1-R6 com os limites, dicionário de dados, decisões de modelagem, fora de escopo |
| [`docs/diagrama-classes.md`](docs/diagrama-classes.md) | Diagrama de classes UML (Mermaid) e a justificativa de cada relacionamento |
| [`docs/casos-de-teste.md`](docs/casos-de-teste.md) | 24 casos de teste, com o resultado obtido no menu e o teste JUnit correspondente |

---

## Como executar

Pré-requisitos: **JDK 17+** e **Maven** (`java -version` e `mvn -v` respondem).

```bash
mvn test                                                      # roda os 44 testes JUnit
mvn -q package -DskipTests                                    # compila
java -cp target/classes br.edu.fapa.ap.bicicletario.Main      # abre o menu
```

Na primeira execução, o Maven baixa o JUnit e pode levar alguns minutos. No menu, a opção **6** carrega 3 ciclistas e 2 bicicletas **fictícios** para a demonstração.

## Estrutura

```
a3-bicicletario/
├── pom.xml                  # Java 17, JUnit 5.10.2 (o mesmo da Aula 22)
├── README.md · AGENTS.md · opencode.json · .gitignore
├── docs/
│   ├── analise.md
│   ├── diagrama-classes.md
│   └── casos-de-teste.md
└── src/
    ├── main/java/br/edu/fapa/ap/bicicletario/
    │   ├── Main.java            # menu: só lê, chama e mostra
    │   ├── Bicicletario.java    # composição de Vaga; matriz de ocupação
    │   ├── Ciclista.java · Bicicleta.java · Vaga.java
    │   └── Uso.java · Tarifa.java
    └── test/java/br/edu/fapa/ap/bicicletario/
        └── TarifaTest · CiclistaTest · VagaTest · UsoTest · BicicletarioTest
```

---

## Mapa de estruturas

Onde cada estrutura exigida pela A3 aparece no código, e para que serve.

| Estrutura | Onde (arquivo e linha) | Para que serve |
|---|---|---|
| Constantes (`static final`) | `Tarifa.java` 16-25, `Ciclista.java` 15-19, `Bicicletario.java` 20-32, `Uso.java` 12 | Todos os limites das regras R1-R6; nenhum número mágico |
| Tipos | `int`, `double`, `boolean`, `String`, `char` (`Ciclista.java` 52), `int[][]` | Minutos, valores, estados, textos |
| Lista (vetor dinâmico) | `Bicicletario.java` 34-36 | Vagas, ciclistas e usos |
| **Matriz** | `Bicicletario.java` 54 (`new int[7][3]`), mostrada em `Main.java` 148-153 | Entradas por dia da semana × turno |
| Operadores e precedência | `Tarifa.java` 59: `(excedente + 60 - 1) / 60` | Arredondamento **para cima** da hora iniciada com divisão inteira |
| Decisão `if`/`else` | `Tarifa.java` 50-63; `Main.java` 75-84 (`else if` em cadeia) | Faixas da tarifa; mensagem certa para cada recusa |
| Decisão aninhada | `Main.java` 200-204 (`if` dentro de `if`) | Só confere a faixa se o texto for um número |
| Condição composta (`&&`, `\|\|`, `!`) | `Tarifa.java` 50; `Bicicletario.java` 102 | Minutos fora de 0-1440; dados de entrada inválidos |
| `switch` | `Main.java` 30-55 (menu, com `default`); `Main.java` 106-122 | Opções do menu; código de erro → mensagem |
| `do...while` | `Main.java` 27-56 | O menu repete até a opção 0 |
| `while` | `Main.java` 191 | Repete a pergunta até a entrada ser válida |
| `for` | `Ciclista.java` 51 (percorre a matrícula); `Bicicletario.java` 58 (cria as vagas) | Conferir dígito a dígito; composição |
| `for` aninhado | `Bicicletario.java` 201-202 e 216-217; `Main.java` 148-150 | Copiar, procurar o maior e mostrar a matriz |
| Validação de entrada | `Main.java` 190-208 (`lerInteiro`, com `hasNextInt()`) | Letra ou número fora da faixa não derrubam o programa |
| Métodos com parâmetro e retorno | `Tarifa.calcular(int)`, `Ciclista.matriculaValida(String)`, `Bicicletario.registrarEntrada(...)` | As regras ficam testáveis sem teclado |

## Orientação a objetos

| Conceito (aula) | Onde | Decisão |
|---|---|---|
| Classes e objetos (27) | 6 classes de domínio + `Main` | Cada classe é dona dos próprios dados e regras |
| Construtores e sobrecarga, `this(...)` (28) | `Tarifa()` → `this(180, 2.0, 10.0)`; `Ciclista(nome, matricula)` → `this(nome, matricula, 0)`; `Bicicletario()` → `this(40, new Tarifa())` | O objeto nasce válido; o construtor curto reaproveita o completo |
| Encapsulamento (29) | todos os atributos `private` | Setters (`setNome`, `setCor`) **recusam** valor inválido e mantêm o anterior |
| Atributo sem setter (29) | `Vaga.ocupada`, `Ciclista.atrasos`, `Ciclista.matricula` | Um `setOcupada(true)` poria duas bicicletas na mesma vaga; um `setAtrasos(0)` desbloquearia qualquer um. Eles só mudam por `ocupar()`/`liberar()` e `registrarAtraso()` |
| Composição (30) | `Bicicletario` cria as `Vaga`s no construtor | A vaga não existe sem o bicicletário |
| Associação (30) | `Bicicleta` → `Ciclista`; `Uso` → `Ciclista`, `Bicicleta`, `Vaga` | Os objetos têm vida própria |
| Regras nos métodos | `Tarifa.calcular`, `Uso.encerrar`, `Bicicletario.registrarEntrada` | O `Main` não tem nenhuma regra de negócio |

---

## Testes

- **44 testes JUnit 5**, todos no padrão AAA, rodando com `mvn test` (11 deles são as linhas de um `@ParameterizedTest` com os limites da tarifa)
- **24 casos de teste** em [`docs/casos-de-teste.md`](docs/casos-de-teste.md), executados pelo menu e pelo JUnit

### Prova de que os testes pegam erro (quebras de propósito)

O código foi quebrado de propósito em 5 pontos, um de cada vez, e a suíte foi rodada. Resultado real:

| # | Quebra | Testes que ficaram vermelhos |
|---|---|---|
| 1 | `Tarifa.java` 59: arredondamento para cima trocado por `excedente / 60` | **7**, entre eles `TarifaTest` (181 min: esperado 2.0, obtido 0.0) e `UsoTest.encerrarCalculaOValorELiberaAVaga` |
| 2 | `Ciclista.java`: `atrasos >= MAX_ATRASOS` trocado por `>` | **2**: `CiclistaTest.ct15_comTresAtrasosFicaBloqueado` e `BicicletarioTest.ct20_ciclistaBloqueadoNaoEntra` |
| 3 | `Uso.java`: removida a linha `vaga.liberar();` | **2**: `UsoTest.encerrarCalculaOValorELiberaAVaga` e `BicicletarioTest.saidaCobraELiberaAVaga` |
| 4 | `Bicicletario.getOcupacao()` devolvendo a matriz original em vez da cópia | **1**: `BicicletarioTest.getOcupacaoDevolveUmaCopia` (esperado 0, obtido 99) |
| 5 | `Tarifa.java` 53: `minutos <= limiteGratisMin` trocado por `<` | **Nenhum.** Ver a análise abaixo |

**Por que a quebra 5 passou?** Com `<`, 180 min deixa de entrar no `if` da faixa grátis, mas cai no cálculo seguinte: excedente = 0, horas iniciadas = (0 + 59) / 60 = 0, valor = R$ 0,00. O resultado é o mesmo, então **nenhum teste poderia falhar**: é um *mutante equivalente*. O `if` da linha 53 não muda o resultado para minutos de 0 a 1440; ele existe para deixar a regra R1 **visível** no código. Esta é a resposta honesta para a pergunta "o que este teste detectaria?": aqui, nada, e o motivo é conhecido.

---

## Ética e Dados

- **Dados pessoais guardados:** nome e matrícula. A matrícula é necessária para identificar quem tem atrasos (R4); o nome, para a portaria chamar a pessoa. **Não** se coleta CPF, telefone, e-mail nem foto: o sistema funciona sem eles (minimização, LGPD art. 6º, III).
- **Quem pode ser prejudicado:** a regra de bloqueio (R4). Um funcionário de turno noturno que deixa a bicicleta de um dia para o outro por necessidade acumula atrasos sem culpa. Por isso o sistema **avisa a cada atraso** ("permanência acima de 12 h conta um atraso") e a mensagem de bloqueio diz o motivo e manda procurar a administração, em vez de só recusar.
- **Resultados explicáveis:** toda recusa diz **por que** aconteceu (matrícula inválida, ciclista já estacionado, lotado). A tarifa é uma regra simples e publicável.
- **Nenhum dado real:** os nomes e matrículas dos testes e da opção 6 são fictícios ("Ana Teste", 100001).

---

## Uso de IA

> ⚠️ **Exemplo de formato.** Numa entrega real, **cada linha descreve um uso que aconteceu**, com o erro real do agente. Não copiem estas linhas: registrem as suas **enquanto** usam o agente.

**Ferramenta e modelo:** OpenCode + Nemotron 3 Ultra (`:free`) via OpenRouter (configuração da Aula 01B).
**Skills:** `grilling`, `tdd`, `code-review`.
**Configuração:** [`opencode.json`](opencode.json) (push negado, comandos com `ask`) e [`AGENTS.md`](AGENTS.md) na raiz do projeto.

| # | Artefato | Pedido (resumo) | O que o agente errou ou omitiu | O que a equipe fez |
|---|---|---|---|---|
| 1 | `docs/analise.md` | `grilling` sobre as regras da tarifa | Não perguntou se 180 min é grátis ou pago (limite inclusivo ou não) | Decidimos "até 180 inclusive" e escrevemos o limite exato na R1 |
| 2 | `Tarifa.java` | Revisar o cálculo da hora iniciada | Sugeriu `excedente / 60`, que cobra R$ 0,00 por 181 min (divisão inteira) | Trocamos por `(excedente + 59) / 60` e criamos os casos 181, 240 e 241 |
| 3 | `Vaga.java` | Revisar o encapsulamento | Propôs `setOcupada(boolean)` público "para facilitar" | Mantivemos sem setter; a vaga só muda por `ocupar()`/`liberar()` |
| 4 | `TarifaTest.java` | `tdd`: testes da tarifa | Só gerou testes no meio das faixas (100, 200, 500 min) | Acrescentamos os dois lados de cada limite (180/181, 240/241, 420/421) |
| 5 | diagrama de classes | Classificar os relacionamentos | Chamou `Bicicletario`–`Vaga` de agregação | Pelo ciclo de vida (as vagas nascem no construtor), é composição |

- **Testes escritos com ajuda do agente** foram aceitos só depois de verem o código quebrado de propósito (seção "Quebras de propósito").
- **Reflexão:** o agente ajudou mais na entrevista sobre as regras e na lista de casos inválidos; errou justamente nos limites e na divisão inteira — os pontos em que a A3 mais cobra. Faríamos o `grilling` antes de qualquer código.

## Divisão de tarefas

| Integrante | Responsável por | Revisou |
|---|---|---|
| Integrante 1 | `Tarifa`, `Uso`, `TarifaTest`, `UsoTest`, análise | `Bicicletario` |
| Integrante 2 | `Ciclista`, `Bicicleta`, `Vaga`, `Bicicletario`, `Main`, demais testes | `Tarifa`, `Uso` |

Os dois explicam qualquer trecho do código (defesa oral).
