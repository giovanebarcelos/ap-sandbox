public class MaiorMenor {
    public static void main(String[] args) {
        int[] numeros = {4, 15, 8, 23, 16, 42, 7, 11, 9, 30};
        int maior = numeros[0], menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) maior = numeros[i];
            if (numeros[i] < menor) menor = numeros[i];
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
