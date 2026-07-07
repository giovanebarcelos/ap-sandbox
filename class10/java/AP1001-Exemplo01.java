import java.util.Scanner;
public class BuscaNoVetor {
    public static void main(String[] args) {
        int[] numeros = {10, 25, 33, 47, 52, 68, 71};
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número a buscar: ");
        int buscado = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                System.out.println("Encontrado na posição " + i + "!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) System.out.println("Número não encontrado no vetor.");
        sc.close();
    }
}