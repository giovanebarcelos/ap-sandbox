import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    static void validarNomeUsuario(String nomeUsuario) {
        if (nomeUsuario == null || nomeUsuario.trim().isEmpty()) {
            throw new IllegalArgumentException("nome invalido");
        }
        if (nomeUsuario.length() > 100) {
            throw new IllegalArgumentException("nome muito longo");
        }
    }

    static String calcularHashSHA256(String texto) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(texto.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        validarNomeUsuario("Ana");
        System.out.println("Nome valido aceito");

        try {
            validarNomeUsuario("");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Hash de 'minhaSenha123': " + calcularHashSHA256("minhaSenha123"));
        System.out.println("Hash de 'minhaSenha124': " + calcularHashSHA256("minhaSenha124"));
    }
}
