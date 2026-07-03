import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1-Somar 2-Sub 3-Mult 4-Div 5-Sair");
            int op = sc.nextInt();
            if (op == 5) break;
            System.out.print("N1: "); double a = sc.nextDouble();
            System.out.print("N2: "); double b = sc.nextDouble();
            double r = 0;
            switch (op) {
                case 1: r = a+b; break; case 2: r = a-b; break;
                case 3: r = a*b; break; case 4: if(b!=0) r=a/b; else System.out.println("Erro"); break;
            }
            System.out.println("Resultado: " + r);
        }
    }
}
