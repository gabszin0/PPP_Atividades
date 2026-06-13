public class Main {
    public static void main(String[] args) {
        CalculadoraDecimal calculadora = new CalculadoraAdapter();

        int resultado1 = calculadora.somar(10, 5);
        System.out.println("10 + 5 = " + resultado1);

        int resultado2 = calculadora.subtrair(20, 8);
        System.out.println("20 - 8 = " + resultado2);

        int resultado3 = calculadora.multiplicar(7, 6);
        System.out.println("7 x 6 = " + resultado3);

        int resultado4 = calculadora.somar(100, 50);
        System.out.println("100 + 50 = " + resultado4);

        int resultado5 = calculadora.subtrair(100, 35);
        System.out.println("100 - 35 = " + resultado5);

        int resultado6 = calculadora.multiplicar(12, 5);
        System.out.println("12 x 5 = " + resultado6);
    }
}
