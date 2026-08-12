class Funcionario {
    String nome;
    double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    double calcularBonificacao() {
        return salario * 0.05;
    }
}

class Gerente extends Funcionario {
    Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    double calcularBonificacao() {
        return salario * 0.20;
    }
}

class Vendedor extends Funcionario {
    Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    double calcularBonificacao() {
        return salario * 0.10;
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario[] equipe = {
            new Gerente("Ana", 8000.0),
            new Vendedor("Beto", 3000.0),
            new Funcionario("Caio", 2000.0)
        };

        for (Funcionario f : equipe) {
            System.out.println(f.nome + ": " + f.calcularBonificacao());
        }
    }
}
