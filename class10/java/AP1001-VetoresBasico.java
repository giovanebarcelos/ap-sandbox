public class VetoresBasico {
    public static void main(String[] args) {
        double[] notas = {7.5, 8.0, 6.5, 9.0, 7.0};
        notas[0] = 10.0;   // altera o primeiro elemento
        System.out.println("Terceiro elemento (indice 2): " + notas[2]);
        System.out.print("Vetor completo: ");
        for (double n : notas) System.out.print(n + " ");
        System.out.println();
        System.out.println("Tamanho: " + notas.length);
    }
}
