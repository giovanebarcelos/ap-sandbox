# ap-sandbox — Códigos do Curso Algoritmos e Programação

Repositório de código-fonte do curso **Algoritmos e Programação**  .
Cada exemplo é implementado em **3 linguagens** — Python, Java e C++ — a partir do mesmo algoritmo
apresentado em **Portugol** nos slides das aulas.

**Prof. Giovane Barcelos** 

---

## Estrutura de diretórios

```
repository/
  class01/                     # Uma pasta por aula (class01 … class26)
    python/  AP0101-*.py       # Python 3.10+
    java/    AP0101-*.java      # Java 17+
    cpp/     AP0101-*.cpp       # C++17
  ...
  class26/
  README.md                    # Este arquivo
```

### Convenção de nomes

```
AP0101-NomeDescritivo.ext
│  │ │
│  │ └─ Sequencial dentro da aula (01–99)
│  └─── Número da aula (01–26)
└────── Prefixo do projeto: AP = Algoritmos e Programação
```

> **Nota (Java):** a classe pública usa um nome descritivo válido (ex.: `MediaDuasNotas`),
> pois nomes de arquivo com hífen/dígitos iniciais não são identificadores Java válidos.
> Para compilar, renomeie o arquivo para o nome da classe (ex.: `MediaDuasNotas.java`) ou
> use o nome da classe ao executar.

---

## Tecnologias

| Linguagem | Versão | Uso |
|---|---|---|
| **Portugol** | Portugol Studio 3+ | Algoritmo base (nos slides) |
| **Python** | 3.10+ | Scripts concisos e legíveis |
| **Java** | 17+ (JDK) | Orientação a objetos, tipagem forte |
| **C++** | C++17 (g++) | Performance, controle de memória |

---

## Como executar

### Python
```bash
python3 class01/python/AP0101-OlaMundo.py
```

### Java
```bash
# renomeie para o nome da classe pública antes de compilar
cp class01/java/AP0101-OlaMundo.java OlaMundo.java
javac OlaMundo.java
java OlaMundo
```

### C++
```bash
g++ -std=c++17 class01/cpp/AP0102-SomaDoisNumeros.cpp -o soma
./soma
```

### Pré-requisitos por sistema
| Sistema | Python | Java (JDK 17) | C++ (g++) |
|---|---|---|---|
| Fedora | `sudo dnf install python3` | `sudo dnf install java-17-openjdk-devel` | `sudo dnf install gcc-c++` |
| Ubuntu | `sudo apt install python3` | `sudo apt install openjdk-17-jdk` | `sudo apt install g++` |
| Windows | python.org | adoptium.net | MinGW-w64 / WSL |

---

## Sumário por aula (exemplos curados, referenciados nos slides)

| Aula | Tema | Exemplos principais |
|---|---|---|
| 01 | Introdução à Lógica | OlaMundo, SomaDoisNumeros, MediaDuasNotas |
| 02 | Fluxogramas | MediaAprovacao |
| 05 | Do Fluxograma ao Código | ParOuImpar, CalculadoraSimples |
| 06 | Introdução ao Portugol | MediaAprovacao |
| 08 | Tipos de Dados | OperacoesTexto, ConversaoTipos |
| 10 | Vetores e Matrizes | VetoresBasico, MediaVetor, MaiorMenor, MatrizBasica, BoletimMatriz, SomaMatrizes, TabuadaMatriz |
| 11 | Estrutura Sequencial | CalculoSalario |
| 12 | Operadores e Expressões | AnoBissexto |
| 14 | SE / SENÃO | AprovadoReprovado |
| 15 | Condicionais Múltiplas | MenuOperacoes |
| 16 | Operadores Lógicos | Triangulo |
| 20 | Loops Aninhados | PadraoAsteriscos |
| 23 | Funções e Parâmetros | BibliotecaMatematica |
| 24 | Projeto Biblioteca | BibliotecaFuncoes |

> Cada aula contém ainda 2 exemplos complementares nomeados (sequências `08`/`09`), como
> `AP0108-AreaRetangulo`, `AP1208-Bhaskara`, `AP2409-CalculaIMC` — todos com código real e
> executável (não há mais arquivos-placeholder `ExemploNN`).

---

## Licença

Material acadêmico produzido para uso. Uso educacional.
