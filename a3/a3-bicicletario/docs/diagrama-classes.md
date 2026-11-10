# Diagrama de Classes — Bicicletário do Campus

Notação da Aula 30: linha com seta = associação; losango cheio = composição. `-` é privado, `+` é público. O GitHub desenha o diagrama a partir do bloco Mermaid abaixo; para colar em slides, exporte em [mermaid.live](https://mermaid.live) ou redesenhe no Draw.io.

```mermaid
classDiagram
    direction LR

    class Bicicletario {
        +CAPACIDADE_PADRAO$ int = 40
        +MAX_CICLISTAS$ int = 100
        -vagas ArrayList~Vaga~
        -ciclistas ArrayList~Ciclista~
        -usos ArrayList~Uso~
        -tarifa Tarifa
        -ocupacao int[7][3]
        +Bicicletario()
        +Bicicletario(capacidade int, tarifa Tarifa)
        +cadastrarCiclista(nome String, matricula String) boolean
        +buscarCiclista(matricula String) Ciclista
        +registrarEntrada(matricula, codigo, cor, dia, turno) int
        +registrarSaida(numeroVaga int, minutos int) double
        +vagasLivres() int
        +totalArrecadado() double
        +getOcupacao() int[][]
        +horarioMaisMovimentado() int[]
    }

    class Vaga {
        -numero int
        -ocupada boolean
        +Vaga(numero int)
        +ocupar() boolean
        +liberar() boolean
        +isOcupada() boolean
    }

    class Ciclista {
        +MAX_ATRASOS$ int = 3
        -matricula String
        -nome String
        -atrasos int
        +Ciclista(nome String, matricula String)
        +Ciclista(nome String, matricula String, atrasos int)
        +nomeValido(nome String)$ boolean
        +matriculaValida(matricula String)$ boolean
        +registrarAtraso() void
        +isBloqueado() boolean
        +setNome(nome String) boolean
    }

    class Bicicleta {
        -codigo String
        -cor String
        -dono Ciclista
        +Bicicleta(codigo String, cor String, dono Ciclista)
        +codigoValido(codigo String)$ boolean
        +setCor(cor String) boolean
    }

    class Uso {
        +LIMITE_ATRASO_MIN$ int = 720
        -diaSemana int
        -turno int
        -aberto boolean
        -minutos int
        -valor double
        +Uso(ciclista, bicicleta, vaga, dia, turno)
        +encerrar(minutos int, tarifa Tarifa) double
        +isAberto() boolean
    }

    class Tarifa {
        -limiteGratisMin int
        -valorPorHora double
        -teto double
        +Tarifa()
        +Tarifa(limiteGratisMin int, valorPorHora double, teto double)
        +calcular(minutos int) double
    }

    Bicicletario "1" *-- "1..40" Vaga : composição
    Bicicletario "1" --> "0..100" Ciclista : cadastra
    Bicicletario "1" --> "0..*" Uso : registra
    Bicicletario "1" --> "1" Tarifa : usa
    Bicicleta "0..*" --> "1" Ciclista : dono
    Uso "0..*" --> "1" Ciclista
    Uso "0..*" --> "1" Bicicleta
    Uso "0..*" --> "1" Vaga
```

## Como ler os relacionamentos

| Relacionamento | Tipo | Pergunta do ciclo de vida (Aula 30) |
|---|---|---|
| `Bicicletario` ◆— `Vaga` | **Composição** | A vaga existe sem o bicicletário? **Não**: é criada no construtor dele |
| `Bicicleta` → `Ciclista` | Associação | O ciclista existe sem a bicicleta? **Sim** |
| `Uso` → `Ciclista`, `Bicicleta`, `Vaga` | Associação | Algum deles deixa de existir quando o uso termina? **Não** |
| `Bicicletario` → `Ciclista`, `Uso`, `Tarifa` | Associação | O bicicletário guarda referências; os objetos têm vida própria |
