class Retangulo {
    double largura;
    double altura;

    double calcularArea() {
        return largura * altura;
    }

    double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}

public class Main {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        r1.largura = 5.0;
        r1.altura = 3.0;
        System.out.println("Area: " + r1.calcularArea());
        System.out.println("Perimetro: " + r1.calcularPerimetro());
    }
}
