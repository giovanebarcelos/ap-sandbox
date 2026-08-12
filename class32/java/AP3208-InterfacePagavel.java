interface Pagavel {
    double calcularValorPagamento();
}

class Funcionario implements Pagavel {
    String nome;
    double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularValorPagamento() {
        return salario;
    }
}

class Fornecedor implements Pagavel {
    String razaoSocial;
    double valorContrato;

    Fornecedor(String razaoSocial, double valorContrato) {
        this.razaoSocial = razaoSocial;
        this.valorContrato = valorContrato;
    }

    public double calcularValorPagamento() {
        return valorContrato * 0.9;
    }
}

public class Main {
    static double totalAPagar(Pagavel[] itens) {
        double total = 0;
        for (Pagavel p : itens) {
            total = total + p.calcularValorPagamento();
        }
        return total;
    }

    public static void main(String[] args) {
        Pagavel[] itens = {
            new Funcionario("Ana", 5000.0),
            new Fornecedor("Papelaria XYZ", 2000.0)
        };
        System.out.println("Total a pagar: " + totalAPagar(itens));
    }
}
