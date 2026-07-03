public class Sub {
    static void exibirMenu() {
        System.out.println("1 - Sacar\n2 - Depositar\n3 - Sair");
    }
    static int dobro(int n) { return n * 2; }
    public static void main(String[] args) {
        exibirMenu();
        System.out.println("Dobro de 5 = " + dobro(5));
    }
}
