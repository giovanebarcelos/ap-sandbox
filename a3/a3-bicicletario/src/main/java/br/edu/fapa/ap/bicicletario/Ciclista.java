package br.edu.fapa.ap.bicicletario;

/**
 * Pessoa da comunidade do campus que usa o bicicletário.
 *
 * Encapsulamento:
 * - a matrícula é final e não tem setter: ela identifica o ciclista;
 * - os atrasos NÃO têm setter público: só aumentam por registrarAtraso(),
 *   chamado pelo Uso quando a permanência passa de 12 h (regra R4). Se houvesse
 *   setAtrasos(0), qualquer parte do programa poderia "desbloquear" alguém.
 */
public class Ciclista {

    /** R4: com este número de atrasos o ciclista fica bloqueado. */
    public static final int MAX_ATRASOS = 3;

    public static final int TAMANHO_MATRICULA = 6;
    public static final int NOME_MIN = 2;
    public static final int NOME_MAX = 60;

    private final String matricula;
    private String nome;
    private int atrasos;

    /** Ciclista novo, sem atrasos. Pré-condição: dados conferidos por nomeValido() e matriculaValida(). */
    public Ciclista(String nome, String matricula) {
        this(nome, matricula, 0);
    }

    /** Ciclista já com histórico de atrasos (ex.: carregado de um cadastro anterior). */
    public Ciclista(String nome, String matricula, int atrasos) {
        this.matricula = matricula;
        this.nome = nome.trim();
        this.atrasos = Math.max(atrasos, 0); // atraso negativo não existe
    }

    /** Nome com 2 a 60 caracteres, sem contar espaços nas pontas. */
    public static boolean nomeValido(String nome) {
        if (nome == null) {
            return false;
        }
        int tamanho = nome.trim().length();
        return tamanho >= NOME_MIN && tamanho <= NOME_MAX;
    }

    /** Matrícula com exatamente 6 dígitos (R6). */
    public static boolean matriculaValida(String matricula) {
        if (matricula == null || matricula.length() != TAMANHO_MATRICULA) {
            return false;
        }
        for (int i = 0; i < matricula.length(); i++) {
            if (!Character.isDigit(matricula.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /** R4: registra mais um atraso (permanência acima de 12 h). */
    public void registrarAtraso() {
        atrasos++;
    }

    /** R4: bloqueado a partir de MAX_ATRASOS atrasos. */
    public boolean isBloqueado() {
        return atrasos >= MAX_ATRASOS;
    }

    /** Troca o nome; recusa (e mantém o anterior) se for inválido. */
    public boolean setNome(String novoNome) {
        if (!nomeValido(novoNome)) {
            return false;
        }
        this.nome = novoNome.trim();
        return true;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAtrasos() {
        return atrasos;
    }
}
