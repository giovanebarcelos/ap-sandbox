# AGENTS.md
A3 — Bicicletário do Campus. Java 17+, Maven e JUnit 5, rota orientada a objetos.

## Onde está cada coisa
- Análise: docs/analise.md · Diagrama de classes: docs/diagrama-classes.md · Casos de teste: docs/casos-de-teste.md
- Código: src/main/java/br/edu/fapa/ap/bicicletario/ (Main = menu; regras nas classes de domínio)
- Testes JUnit: src/test/java/br/edu/fapa/ap/bicicletario/ — rodar com `mvn test`

## Regras
- MODO TUTOR: o agente revisa, testa e pergunta; o código é da equipe (trechos sugeridos pelo agente são declarados no README)
- Regras de negócio ficam nas classes de domínio; o Main só lê, chama e mostra
- Atributos sempre private; setter que recebe valor inválido devolve false e mantém o valor anterior
- Limites das regras são constantes (static final); nada de número mágico
- Antes de aceitar código: `mvn test` verde e conferência à mão com valores dos dois lados do limite
- Nada de dados pessoais reais (nomes e matrículas dos testes são fictícios); commits curtos; nunca faça push

## Agent skills
(bloco escrito pela skill setup-matt-pocock-skills)
