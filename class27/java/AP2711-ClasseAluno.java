class Aluno {
    String nome;
    double media;

    boolean estaAprovado() {
        return media >= 7.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Fernanda";
        a1.media = 8.5;

        Aluno a2 = new Aluno();
        a2.nome = "Gustavo";
        a2.media = 5.2;

        System.out.println(a1.nome + " aprovado? " + a1.estaAprovado());
        System.out.println(a2.nome + " aprovado? " + a2.estaAprovado());
    }
}
