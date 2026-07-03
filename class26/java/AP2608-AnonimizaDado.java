public class AnonimizaDado {
    public static void main(String[] x) {
        String cpf = "123.456.789-00";
        System.out.println("CPF anonimizado: ***." + cpf.substring(4, 7) + ".***-**");
    }
}
