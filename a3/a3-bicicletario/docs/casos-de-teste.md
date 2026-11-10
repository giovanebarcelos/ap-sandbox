# Casos de Teste — Bicicletário do Campus

Cada caso foi **executado de verdade** de dois jeitos: pelo menu (`java -cp target/classes br.edu.fapa.ap.bicicletario.Main`) e pelo teste JUnit indicado. O "resultado obtido" é o que o programa mostrou.

Para repetir pelo menu, comece com a opção **6** (dados de exemplo): ela cadastra os ciclistas 100001, 100002 e 100003 e estaciona B10 (vaga 1) e B20 (vaga 2).

| ID | Regra | Tipo | Entrada | Resultado esperado | Resultado obtido (menu) | Teste JUnit |
|---|---|---|---|---|---|---|
| CT01 | R1 | limite | saída da vaga 1 com 0 min | R$ 0,00 | R$ 0,00 | `TarifaTest` (CT01) |
| CT02 | R1 | **limite** | saída com **180** min | R$ 0,00 | R$ 0,00 | `TarifaTest` (CT02) |
| CT03 | R2 | **limite** | saída com **181** min | R$ 2,00 | R$ 2,00 | `TarifaTest` (CT03) |
| CT04 | R2 | limite | saída com 240 min | R$ 2,00 | R$ 2,00 | `TarifaTest` (CT04) |
| CT05 | R2 | limite | saída com 241 min | R$ 4,00 | R$ 4,00 | `TarifaTest` (CT05) |
| CT06 | R2 | válido | saída com 300 min | R$ 4,00 | R$ 4,00 | `TarifaTest` (CT06) |
| CT07 | R2 | limite | saída com 301 min | R$ 6,00 | R$ 6,00 | `TarifaTest` (CT07) |
| CT08 | R2 | limite | saída com 420 min | R$ 8,00 | R$ 8,00 | `TarifaTest` (CT08) |
| CT09 | R2 | **limite (teto)** | saída com 421 min | R$ 10,00 | R$ 10,00 | `TarifaTest` (CT09) |
| CT10 | R2 | teto | saída com 481 min (seriam R$ 12,00) | R$ 10,00 | R$ 10,00 | `TarifaTest` (CT10) |
| CT11 | validação | limite | saída com 1440 min | R$ 10,00 | R$ 10,00 | `TarifaTest` (CT11) |
| CT12 | validação | inválido | minutos = −5 | recusa e pergunta de novo | "Valor inválido. Digite um número inteiro de 0 a 1440." | `TarifaTest.ct12_...` |
| CT13 | validação | inválido | minutos = 1441 | recusa e pergunta de novo | "Valor inválido. Digite um número inteiro de 0 a 1440." | `TarifaTest.ct13_...` |
| CT14 | R4 | limite | ciclista com 2 atrasos tenta entrar | entrada aceita | (JUnit) | `CiclistaTest.ct14_...` |
| CT15 | R4 | **limite** | ciclista 100001 com 3 saídas de 721 min tenta entrar | "Ciclista bloqueado" | "Ciclista bloqueado: 3 permanências acima de 12 h. Procure a administração." | `CiclistaTest.ct15_...`, `BicicletarioTest.ct20_...` |
| CT16 | R6 | inválido | cadastro com matrícula 12345 | recusa | "Matrícula inválida: precisa ter exatamente 6 dígitos." | `CiclistaTest.ct16_...` |
| CT17 | R4 | **limite** | saída com 720 min | sem atraso | R$ 10,00, sem aviso de atraso | `UsoTest.ct17_...` |
| CT18 | R4 | **limite** | saída com 721 min | conta um atraso | R$ 10,00 + "Atenção: permanência acima de 12 h conta um atraso." | `UsoTest.ct18_...` |
| CT19 | — | inválido | entrada com matrícula 999999 | recusa | "Matrícula não cadastrada. Cadastre o ciclista primeiro (opção 1)." | `BicicletarioTest.ct19_...` |
| CT20 | R5 | inválido | 100001 tenta estacionar uma 2ª bicicleta (B11) | recusa | "Este ciclista já tem uma bicicleta no bicicletário." | `BicicletarioTest.ct21_...` |
| CT21 | R5 | inválido | 100003 tenta entrar com B10, que já está na vaga 1 | recusa | "Esta bicicleta já está no bicicletário." | `BicicletarioTest.mesmaBicicleta...` |
| CT22 | R3 | **limite** | bicicletário com 2 vagas: 2 entradas e uma 3ª | vagas 1 e 2; a 3ª é recusada | (JUnit, com `new Bicicletario(2, ...)`) | `BicicletarioTest.ct22_...` |
| CT23 | validação | inválido | dia da semana = 9; depois "abc" | recusa e pergunta de novo, sem quebrar | "Valor inválido. Digite um número inteiro de 0 a 6." (as duas vezes) | `BicicletarioTest.ct23_...` |
| CT24 | — | inválido | saída da vaga 5, que está vazia | recusa | "Não há bicicleta na vaga 5." | `BicicletarioTest.ct24_...` |

**Resumo:** 24 casos — 11 de valor-limite, 10 inválidos e 3 válidos; todos com o resultado obtido igual ao esperado. O limite da R3 (40ª e 41ª bicicletas) foi testado com um bicicletário de 2 vagas, porque a regra está no mesmo código para qualquer capacidade; pelo menu, testar exigiria 41 cadastros.
