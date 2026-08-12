import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class Usuario {
    String nome;
    String hashSenha;

    Usuario(String nome, String senha) throws NoSuchAlgorithmException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("nome invalido");
        }
        if (senha == null || senha.length() < 8) {
            throw new IllegalArgumentException("senha deve ter 8+ caracteres");
        }
        this.nome = nome;
        this.hashSenha = calcularHash(senha);
    }

    static String calcularHash(String texto) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(texto.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    boolean verificarSenha(String senhaDigitada) throws NoSuchAlgorithmException {
        return hashSenha.equals(calcularHash(senhaDigitada));
    }
}

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Usuario u1 = new Usuario("Ana", "senhaForte123");
        System.out.println("Usuario criado: " + u1.nome);
        System.out.println("Senha correta? " + u1.verificarSenha("senhaForte123"));
        System.out.println("Senha errada? " + u1.verificarSenha("outraSenha"));
    }
}
