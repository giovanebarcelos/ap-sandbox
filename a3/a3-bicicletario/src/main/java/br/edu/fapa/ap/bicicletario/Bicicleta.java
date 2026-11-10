package br.edu.fapa.ap.bicicletario;

/**
 * Bicicleta deixada no bicicletário.
 *
 * Associação com Ciclista: a bicicleta conhece o dono, mas o ciclista existe
 * sem ela (e a bicicleta não "morre" se o ciclista sair do cadastro).
 */
public class Bicicleta {

    private final String codigo;
    private final Ciclista dono;
    private String cor;

    public Bicicleta(String codigo, String cor, Ciclista dono) {
        this.codigo = codigo.trim().toUpperCase();
        this.cor = cor.trim();
        this.dono = dono;
    }

    /** Código do lacre (ex.: "B12"): 2 a 10 caracteres, sem espaços. */
    public static boolean codigoValido(String codigo) {
        if (codigo == null) {
            return false;
        }
        String limpo = codigo.trim();
        return limpo.length() >= 2 && limpo.length() <= 10 && !limpo.contains(" ");
    }

    /** Troca a cor; recusa cor vazia e mantém a anterior. */
    public boolean setCor(String novaCor) {
        if (novaCor == null || novaCor.trim().isEmpty()) {
            return false;
        }
        this.cor = novaCor.trim();
        return true;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCor() {
        return cor;
    }

    public Ciclista getDono() {
        return dono;
    }
}
