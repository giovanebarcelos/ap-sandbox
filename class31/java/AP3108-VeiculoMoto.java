class Veiculo {
    String marca;
    double velocidadeMaxima;

    Veiculo(String marca, double velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }
}

class Moto extends Veiculo {
    int cilindradas;

    Moto(String marca, double velocidadeMaxima, int cilindradas) {
        super(marca, velocidadeMaxima);
        this.cilindradas = cilindradas;
    }
}

public class Main {
    public static void main(String[] args) {
        Moto m1 = new Moto("Honda", 180.0, 160);
        System.out.println(m1.marca + " - " + m1.velocidadeMaxima + " km/h - " + m1.cilindradas + " cc");
    }
}
