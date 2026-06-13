public class CalculadoraAdapter implements CalculadoraDecimal {
    private CalculadoraBinaria calculadora;

    public CalculadoraAdapter() {
        this.calculadora = new CalculadoraBinaria();
    }

    @Override
    public int somar(int a, int b) {
        String binarioA = Integer.toBinaryString(a);
        String binarioB = Integer.toBinaryString(b);
        String resultadoBinario = calculadora.somar(binarioA, binarioB);
        return Integer.parseInt(resultadoBinario, 2);
    }

    @Override
    public int subtrair(int a, int b) {
        String binarioA = Integer.toBinaryString(a);
        String binarioB = Integer.toBinaryString(b);
        String resultadoBinario = calculadora.subtrair(binarioA, binarioB);
        return Integer.parseInt(resultadoBinario, 2);
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }
}
