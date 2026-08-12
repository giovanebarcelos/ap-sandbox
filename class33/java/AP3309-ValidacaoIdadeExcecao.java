class IdadeInvalidaException extends RuntimeException {
    IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}

public class Main {
    static void validarIdade(int idade) {
        if (idade < 0 || idade > 130) {
            throw new IdadeInvalidaException("idade fora da faixa aceita: " + idade);
        }
    }

    public static void main(String[] args) {
        try {
            validarIdade(-5);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            validarIdade(25);
            System.out.println("Idade 25 valida");
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
