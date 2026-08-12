class Funcionario {
    String nome;
    double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    String descricao() {
        return nome + " - R$ " + salario;
    }
}

class Gerente extends Funcionario {
    double bonus;

    Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    String descricao() {
        return super.descricao() + " (bonus: R$ " + bonus + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Ana", 8000.0, 1500.0);
        System.out.println(g1.descricao());
    }
}
