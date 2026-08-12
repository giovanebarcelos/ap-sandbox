class Formulario {
    static void validarCampo(String nomeCampo, String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            System.out.println("[CAMPO OBRIGATORIO] Preencha " + nomeCampo + " para continuar.");
            throw new IllegalArgumentException(nomeCampo + " vazio");
        }
    }

    static void validarNumero(String nomeCampo, String valor) {
        try {
            Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            System.out.println("[FORMATO INVALIDO] " + nomeCampo + " deve conter apenas numeros.");
            throw new IllegalArgumentException(nomeCampo + " invalido");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String[][] campos = {
            {"Nome", "Ana"},
            {"Idade", "abc"},
            {"Cidade", ""}
        };

        for (String[] campo : campos) {
            String nome = campo[0];
            String valor = campo[1];
            try {
                validarCampoOuNumero(nome, valor);
                System.out.println(nome + ": OK");
            } catch (IllegalArgumentException e) {
                System.out.println(nome + ": rejeitado (" + e.getMessage() + ")");
            }
        }
    }

    static void validarCampoOuNumero(String nome, String valor) {
        Formulario.validarCampo(nome, valor);
        if (nome.equals("Idade")) {
            Formulario.validarNumero(nome, valor);
        }
    }
}
