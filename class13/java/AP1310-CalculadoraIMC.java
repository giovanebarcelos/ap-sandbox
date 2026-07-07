import java.util.Scanner;
public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Peso (kg): "); double peso = sc.nextDouble();
        System.out.print("Altura (m): "); double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("IMC: %.1f%n", imc);
        if (imc < 18.5) System.out.println("Classificação: Abaixo do peso");
        else if (imc < 25) System.out.println("Classificação: Peso normal");
        else if (imc < 30) System.out.println("Classificação: Sobrepeso");
        else System.out.println("Classificação: Obesidade");
        sc.close();
    }
}