import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

interface Notificavel {
    void notificar(String mensagem);
}

abstract class Pessoa {
    private String nome;

    Pessoa(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("nome invalido");
        }
        this.nome = nome;
    }

    String getNome() {
        return nome;
    }

    abstract String descricao();
}

class Doador extends Pessoa implements Notificavel {
    private double valorDoado;

    Doador(String nome, double valorDoado) {
        super(nome);
        if (valorDoado <= 0) {
            throw new IllegalArgumentException("valor doado deve ser positivo");
        }
        this.valorDoado = valorDoado;
    }

    @Override
    String descricao() {
        return getNome() + " doou R$ " + valorDoado;
    }

    public void notificar(String mensagem) {
        System.out.println("Email para " + getNome() + ": " + mensagem);
    }
}

class Voluntario extends Pessoa implements Notificavel {
    private int horasDisponiveis;

    Voluntario(String nome, int horasDisponiveis) {
        super(nome);
        if (horasDisponiveis <= 0) {
            throw new IllegalArgumentException("horas disponiveis deve ser positivo");
        }
        this.horasDisponiveis = horasDisponiveis;
    }

    @Override
    String descricao() {
        return getNome() + " tem " + horasDisponiveis + "h disponiveis por semana";
    }

    public void notificar(String mensagem) {
        System.out.println("SMS para " + getNome() + ": " + mensagem);
    }
}

class Usuario {
    private String nome;
    private String hashSenha;

    Usuario(String nome, String senha) throws NoSuchAlgorithmException {
        if (senha == null || senha.length() < 8) {
            throw new IllegalArgumentException("senha deve ter 8+ caracteres");
        }
        this.nome = nome;
        this.hashSenha = calcularHash(senha);
    }

    private static String calcularHash(String texto) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(texto.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}

class SistemaDeApoio {
    private List<Pessoa> pessoas = new ArrayList<>();

    void cadastrarDoador(String nome, String valorTexto) {
        try {
            double valor = Double.parseDouble(valorTexto);
            Doador d = new Doador(nome, valor);
            pessoas.add(d);
            System.out.println("Doador cadastrado: " + d.descricao());
        } catch (NumberFormatException e) {
            System.out.println("[ERRO] Digite o valor usando apenas numeros.");
        } catch (IllegalArgumentException e) {
            System.out.println("[ERRO] " + e.getMessage());
        }
    }

    void cadastrarVoluntario(String nome, int horas) {
        Voluntario v = new Voluntario(nome, horas);
        pessoas.add(v);
        System.out.println("Voluntario cadastrado: " + v.descricao());
    }

    void notificarTodos(String mensagem) {
        for (Pessoa p : pessoas) {
            if (p instanceof Notificavel) {
                ((Notificavel) p).notificar(mensagem);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        SistemaDeApoio sistema = new SistemaDeApoio();

        sistema.cadastrarDoador("Ana", "500.0");
        sistema.cadastrarVoluntario("Beto", 10);
        sistema.cadastrarDoador("Caio", "abc");   // entrada invalida, tratada

        sistema.notificarTodos("Obrigado por participar!");

        Usuario admin = new Usuario("admin", "senhaForte123");
        System.out.println("Usuario administrador criado com seguranca");
    }
}
