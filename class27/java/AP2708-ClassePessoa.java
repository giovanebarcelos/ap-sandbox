class Pessoa {
    String nome;
    int idade;

    void cumprimentar() {
        System.out.println("Ola, meu nome e " + nome + " e tenho " + idade + " anos");
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Carla";
        p1.idade = 28;
        p1.cumprimentar();

        Pessoa p2 = new Pessoa();
        p2.nome = "Diego";
        p2.idade = 34;
        p2.cumprimentar();
    }
}
