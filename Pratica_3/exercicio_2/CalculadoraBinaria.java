public class CalculadoraBinaria {

    public String somar(String a, String b) {
        int numeroA = Integer.parseInt(a, 2);
        int numeroB = Integer.parseInt(b, 2);
        int resultado = numeroA + numeroB;
        return Integer.toBinaryString(resultado);
    }

    public String subtrair(String a, String b) {
        int numeroA = Integer.parseInt(a, 2);
        int numeroB = Integer.parseInt(b, 2);
        int resultado = numeroA - numeroB;
        return Integer.toBinaryString(resultado);
    }
}
