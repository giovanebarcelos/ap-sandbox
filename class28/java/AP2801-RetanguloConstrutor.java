class Retangulo {
    double largura;
    double altura;

    Retangulo() {
        this(1.0, 1.0);
    }

    Retangulo(double lado) {
        this(lado, lado);
    }

    Retangulo(double l, double a) {
        this.largura = l;
        this.altura = a;
    }

    double calcularArea() {
        return largura * altura;
    }
}

public class Main {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(5.0, 3.0);
        Retangulo r2 = new Retangulo(4.0);
        Retangulo r3 = new Retangulo();

        System.out.println(r1.calcularArea());
        System.out.println(r2.calcularArea());
        System.out.println(r3.calcularArea());
    }
}
