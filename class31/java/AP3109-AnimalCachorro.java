class Animal {
    String nome;
    int idade;

    Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

class Cachorro extends Animal {
    String raca;

    Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }
}

public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Rex", 3, "Labrador");
        System.out.println(c1.nome + ", " + c1.idade + " anos, raca " + c1.raca);
    }
}
