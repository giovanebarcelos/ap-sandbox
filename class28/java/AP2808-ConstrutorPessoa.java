class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void cumprimentar() {
        System.out.println("Ola, meu nome e " + nome + " e tenho " + idade + " anos");
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carla", 28);
        Pessoa p2 = new Pessoa("Diego", 34);
        p1.cumprimentar();
        p2.cumprimentar();
    }
}
