public class ProcedimentoLinha {
    static void linha(String c, int t) {
        for (int i = 0; i < t; i++) System.out.print(c);
        System.out.println();
    }
    public static void main(String[] args) {
        linha("=", 30);
        System.out.println("  SISTEMA DE NOTAS  ");
        linha("-", 30);
        System.out.println("  Aluno: João Silva  ");
        System.out.println("  Nota: 8.5  ");
        linha("=", 30);
    }
}