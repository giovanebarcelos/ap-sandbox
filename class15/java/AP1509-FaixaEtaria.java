public class FaixaEtaria {
    public static void main(String[] x) {
        int idade = 30; String f;
        if (idade < 12) f = "Crianca"; else if (idade < 18) f = "Adolescente";
        else if (idade < 60) f = "Adulto"; else f = "Idoso";
        System.out.println(f);
    }
}
