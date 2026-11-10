package br.edu.fapa.ap.bicicletario;

import java.util.Locale;
import java.util.Scanner;

/**
 * Menu do Bicicletário do Campus.
 *
 * O Main só LÊ, CHAMA e MOSTRA: toda regra de negócio está nas classes de
 * domínio (Tarifa, Ciclista, Vaga, Uso, Bicicletario). Por isso os testes
 * JUnit não precisam simular o teclado.
 */
public class Main {

    private static final int OPCAO_SAIR = 0;
    private static final int OPCAO_MAXIMA = 6;

    private static final String[] NOMES_DIAS = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sáb"};
    private static final String[] NOMES_TURNOS = {"Manhã", "Tarde", "Noite"};

    private static final Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Bicicletario bicicletario = new Bicicletario();
        int opcao;

        do {
            mostrarMenu(bicicletario);
            opcao = lerInteiro("Opção: ", OPCAO_SAIR, OPCAO_MAXIMA);
            switch (opcao) {
                case 1:
                    cadastrarCiclista(bicicletario);
                    break;
                case 2:
                    registrarEntrada(bicicletario);
                    break;
                case 3:
                    registrarSaida(bicicletario);
                    break;
                case 4:
                    mostrarMapaDeOcupacao(bicicletario);
                    break;
                case 5:
                    mostrarRelatorio(bicicletario);
                    break;
                case 6:
                    carregarDadosDeExemplo(bicicletario);
                    break;
                case OPCAO_SAIR:
                    System.out.println("Até logo!");
                    break;
                default:
                    // lerInteiro() já impede opções fora da faixa; fica por segurança
                    System.out.println("Opção inválida.");
            }
        } while (opcao != OPCAO_SAIR);
    }

    private static void mostrarMenu(Bicicletario bicicletario) {
        System.out.println();
        System.out.println("=== BICICLETÁRIO DO CAMPUS ===  vagas livres: "
                + bicicletario.vagasLivres() + "/" + bicicletario.getCapacidade());
        System.out.println("1. Cadastrar ciclista");
        System.out.println("2. Registrar entrada");
        System.out.println("3. Registrar saída e calcular valor");
        System.out.println("4. Mapa de ocupação (dia × turno)");
        System.out.println("5. Relatório");
        System.out.println("6. Carregar dados de exemplo (fictícios)");
        System.out.println("0. Sair");
    }

    private static void cadastrarCiclista(Bicicletario bicicletario) {
        String nome = lerTexto("Nome: ");
        String matricula = lerTexto("Matrícula (6 dígitos): ");
        if (bicicletario.cadastrarCiclista(nome, matricula)) {
            System.out.println("Ciclista cadastrado.");
        } else if (!Ciclista.nomeValido(nome)) {
            System.out.println("Nome inválido: use de " + Ciclista.NOME_MIN + " a "
                    + Ciclista.NOME_MAX + " caracteres.");
        } else if (!Ciclista.matriculaValida(matricula)) {
            System.out.println("Matrícula inválida: precisa ter exatamente "
                    + Ciclista.TAMANHO_MATRICULA + " dígitos.");
        } else {
            System.out.println("Não cadastrado: matrícula repetida ou cadastro cheio.");
        }
    }

    private static void registrarEntrada(Bicicletario bicicletario) {
        String matricula = lerTexto("Matrícula do ciclista: ");
        String codigo = lerTexto("Código do lacre da bicicleta (ex.: B12): ");
        String cor = lerTexto("Cor da bicicleta: ");
        int dia = lerInteiro("Dia (0=Dom 1=Seg 2=Ter 3=Qua 4=Qui 5=Sex 6=Sáb): ",
                0, Bicicletario.DIAS_SEMANA - 1);
        int turno = lerInteiro("Turno (0=Manhã 1=Tarde 2=Noite): ", 0, Bicicletario.TURNOS - 1);

        int resultado = bicicletario.registrarEntrada(matricula, codigo, cor, dia, turno);
        if (resultado > 0) {
            System.out.println("Entrada registrada na vaga " + resultado + ".");
        } else {
            System.out.println(mensagemDeErro(resultado));
        }
    }

    /** Traduz o código de erro do Bicicletario numa mensagem para o usuário. */
    private static String mensagemDeErro(int codigo) {
        switch (codigo) {
            case Bicicletario.ERRO_DADOS_INVALIDOS:
                return "Dados inválidos: confira o código do lacre e a cor.";
            case Bicicletario.ERRO_CICLISTA_INEXISTENTE:
                return "Matrícula não cadastrada. Cadastre o ciclista primeiro (opção 1).";
            case Bicicletario.ERRO_CICLISTA_BLOQUEADO:
                return "Ciclista bloqueado: " + Ciclista.MAX_ATRASOS
                        + " permanências acima de 12 h. Procure a administração.";
            case Bicicletario.ERRO_CICLISTA_JA_ESTACIONADO:
                return "Este ciclista já tem uma bicicleta no bicicletário.";
            case Bicicletario.ERRO_BICICLETA_JA_ESTACIONADA:
                return "Esta bicicleta já está no bicicletário.";
            case Bicicletario.ERRO_LOTADO:
                return "Bicicletário lotado. Tente mais tarde.";
            default:
                return "Erro desconhecido (" + codigo + ").";
        }
    }

    private static void registrarSaida(Bicicletario bicicletario) {
        int vaga = lerInteiro("Número da vaga: ", 1, bicicletario.getCapacidade());
        int minutos = lerInteiro("Minutos estacionado (0 a " + Tarifa.PERMANENCIA_MAXIMA_MIN + "): ",
                0, Tarifa.PERMANENCIA_MAXIMA_MIN);
        double valor = bicicletario.registrarSaida(vaga, minutos);
        if (valor == Tarifa.VALOR_INVALIDO) {
            System.out.println("Não há bicicleta na vaga " + vaga + ".");
        } else {
            System.out.println("Saída registrada. Valor a pagar: " + formatarReais(valor));
            if (minutos > Uso.LIMITE_ATRASO_MIN) {
                System.out.println("Atenção: permanência acima de 12 h conta um atraso.");
            }
        }
    }

    /** Mostra a matriz de ocupação com laço aninhado: linhas = dias, colunas = turnos. */
    private static void mostrarMapaDeOcupacao(Bicicletario bicicletario) {
        int[][] ocupacao = bicicletario.getOcupacao();
        System.out.printf("%-5s", "");
        for (int turno = 0; turno < Bicicletario.TURNOS; turno++) {
            System.out.printf("%7s", NOMES_TURNOS[turno]);
        }
        System.out.println();
        for (int dia = 0; dia < Bicicletario.DIAS_SEMANA; dia++) {
            System.out.printf("%-5s", NOMES_DIAS[dia]);
            for (int turno = 0; turno < Bicicletario.TURNOS; turno++) {
                System.out.printf("%7d", ocupacao[dia][turno]);
            }
            System.out.println();
        }
    }

    private static void mostrarRelatorio(Bicicletario bicicletario) {
        System.out.println("Ciclistas cadastrados: " + bicicletario.totalCiclistas());
        System.out.println("Bicicletas no bicicletário: " + bicicletario.usosAbertos().size());
        for (Uso uso : bicicletario.usosAbertos()) {
            System.out.println("  vaga " + uso.getVaga().getNumero() + ": "
                    + uso.getBicicleta().getCodigo() + " (" + uso.getBicicleta().getCor()
                    + ") de " + uso.getCiclista().getNome());
        }
        System.out.println("Usos encerrados: " + bicicletario.totalUsosEncerrados());
        System.out.println("Total arrecadado: " + formatarReais(bicicletario.totalArrecadado()));
        int[] pico = bicicletario.horarioMaisMovimentado();
        if (pico[0] >= 0) {
            System.out.println("Horário mais movimentado: " + NOMES_DIAS[pico[0]] + " / "
                    + NOMES_TURNOS[pico[1]]);
        }
    }

    /** Dados FICTÍCIOS para a demonstração (nenhuma pessoa real — LGPD). */
    private static void carregarDadosDeExemplo(Bicicletario bicicletario) {
        bicicletario.cadastrarCiclista("Ana Teste", "100001");
        bicicletario.cadastrarCiclista("Bruno Exemplo", "100002");
        bicicletario.cadastrarCiclista("Carla Ficticia", "100003");
        bicicletario.registrarEntrada("100001", "B10", "azul", 1, 0);
        bicicletario.registrarEntrada("100002", "B20", "preta", 1, 1);
        System.out.println("Dados de exemplo carregados: 3 ciclistas e 2 bicicletas (vagas 1 e 2).");
    }

    // ----- leitura do teclado com validação -----

    /**
     * Lê um inteiro entre min e max, repetindo até ser válido.
     * hasNextInt() evita que uma letra derrube o programa.
     */
    private static int lerInteiro(String mensagem, int min, int max) {
        while (true) {
            System.out.print(mensagem);
            if (!teclado.hasNextLine()) {
                // fim da entrada (ex.: Ctrl+D ou arquivo de teste terminou): encerra limpo
                System.out.println();
                System.exit(0);
            }
            String linha = teclado.nextLine().trim();
            Scanner leitor = new Scanner(linha);
            if (leitor.hasNextInt()) {
                int valor = leitor.nextInt();
                if (valor >= min && valor <= max) {
                    return valor;
                }
            }
            System.out.println("Valor inválido. Digite um número inteiro de " + min + " a " + max + ".");
        }
    }

    private static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        if (!teclado.hasNextLine()) {
            System.out.println();
            System.exit(0);
        }
        return teclado.nextLine().trim();
    }

    private static String formatarReais(double valor) {
        return String.format(new Locale("pt", "BR"), "R$ %.2f", valor);
    }
}
