class Formulario {
    static void validarCampo(String nomeCampo, String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            System.out.println("[CAMPO OBRIGATORIO] Preencha " + nomeCampo + " para continuar.");
            throw new IllegalArgumentException(nomeCampo + " vazio");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Formulario.validarCampo("Nome", "Ana");
            System.out.println("Nome valido");
            Formulario.validarCampo("E-mail", "");
        } catch (IllegalArgumentException e) {
            System.out.println("Cadastro interrompido: " + e.getMessage());
        }
    }
}
