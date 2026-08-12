class Circulo {
    double raio;

    Circulo() {
        this(1.0);
    }

    Circulo(double raio) {
        this.raio = raio;
    }

    double calcularArea() {
        return 3.14159 * raio * raio;
    }
}

public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(2.0);
        Circulo c2 = new Circulo();
        System.out.println(c1.calcularArea());
        System.out.println(c2.calcularArea());
    }
}
