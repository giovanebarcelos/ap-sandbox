class Aluno {
    private String nome;
    private double media;

    Aluno(String nome) {
        this.nome = nome;
        this.media = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    public boolean setMedia(double media) {
        if (media < 0 || media > 10) {
            return false;
        }
        this.media = media;
        return true;
    }

    public boolean estaAprovado() {
        return media >= 7.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Fernanda");
        a1.setMedia(8.5);
        System.out.println(a1.getNome() + ": " + a1.getMedia() + " aprovado? " + a1.estaAprovado());

        boolean ok = a1.setMedia(15.0);
        System.out.println("Media invalida aceita? " + ok);
    }
}
