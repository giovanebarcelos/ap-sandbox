# Aula 22 — Teste Unitário em Java com Maven, JUnit 5 e Mockito

Projeto Maven completo (não é um único arquivo `AP22XX-*.java` como os demais
exemplos da aula) para demonstrar como **habilitar teste unitário em Java**
na prática.

## Estrutura

```
teste-maven-junit/
  pom.xml                                          # dependências: junit-jupiter, mockito-junit-jupiter
  src/main/java/br/edu/fapa/ap/
    Calculadora.java                                # dobro, ehPar, fatorial — funções puras
    ServicoNotificacao.java                          # interface (dependência externa simulada)
    Boletim.java                                     # usa ServicoNotificacao (ponto de mock)
  src/test/java/br/edu/fapa/ap/
    CalculadoraTest.java                             # testes unitários simples (sem dublê)
    BoletimTest.java                                 # usa @Mock/@ExtendWith(MockitoExtension.class)
```

## Como executar

Pré-requisito: JDK 17+ e Maven instalados (`sudo dnf install maven` /
`sudo apt install maven`).

```bash
cd class22/java/teste-maven-junit
mvn test
```

Saída esperada (resumo do Surefire):

```
Tests run: 7, Failures: 0, Errors: 0, Skipped: 0 -- in br.edu.fapa.ap.CalculadoraTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0 -- in br.edu.fapa.ap.BoletimTest
BUILD SUCCESS
```

## Por que Mockito aqui?

`Boletim.processarAluno` depende de `ServicoNotificacao`, que em produção
enviaria um e-mail/SMS de verdade. No teste, `@Mock` cria um **dublê**: um
objeto que implementa a interface sem executar o envio real, permitindo
verificar (`verify(servico).enviar(...)`) que a chamada certa foi feita —
sem custo, sem rede e sem efeito colateral.
