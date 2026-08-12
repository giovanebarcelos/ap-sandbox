abstract class Forma {
    String nome;

    Forma(String nome) {
        this.nome = nome;
    }

    abstract double calcularArea();

    void exibirResumo() {
        System.out.println(nome + ": area = " + calcularArea());
    }
}

class Circulo extends Forma {
    double raio;

    Circulo(double raio) {
        super("Circulo");
        this.raio = raio;
    }

    double calcularArea() {
        return 3.14159 * raio * raio;
    }
}

class Quadrado extends Forma {
    double lado;

    Quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }

    double calcularArea() {
        return lado * lado;
    }
}

public class Main {
    public static void main(String[] args) {
        Forma[] formas = { new Circulo(3.0), new Quadrado(4.0) };
        for (Forma f : formas) {
            f.exibirResumo();
        }
    }
}
