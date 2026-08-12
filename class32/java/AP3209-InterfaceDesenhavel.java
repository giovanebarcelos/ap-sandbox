interface Desenhavel {
    void desenhar();
}

class Circulo implements Desenhavel {
    public void desenhar() {
        System.out.println("Desenhando um circulo (**)");
    }
}

class Quadrado implements Desenhavel {
    public void desenhar() {
        System.out.println("Desenhando um quadrado ([])");
    }
}

class Triangulo implements Desenhavel {
    public void desenhar() {
        System.out.println("Desenhando um triangulo (^^)");
    }
}

public class Main {
    public static void main(String[] args) {
        Desenhavel[] formas = { new Circulo(), new Quadrado(), new Triangulo() };
        for (Desenhavel f : formas) {
            f.desenhar();
        }
    }
}
