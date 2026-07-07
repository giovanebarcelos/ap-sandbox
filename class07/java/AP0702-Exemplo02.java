public class TesteMesaSimples {
    public static void main(String[] args) {
        int x = 5, y = 10;
        System.out.println("Antes: x=" + x + ", y=" + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Depois da troca: x=" + x + ", y=" + y);
        System.out.println("Os valores foram trocados sem variável extra!");
    }
}