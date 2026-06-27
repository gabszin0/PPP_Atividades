public class SedexFrete implements FreteStrategy {

    private static final double TAXA_FIXA       = 15.00;
    private static final double VALOR_POR_KG    =  4.50;
    private static final int    PRAZO_DIAS_UTEIS =  1;

    @Override
    public double calcularFrete(double pesoKg) {
        if (pesoKg <= 0) throw new IllegalArgumentException("Peso deve ser positivo.");
        return TAXA_FIXA + (pesoKg * VALOR_POR_KG);
    }

    @Override
    public String getNome() {
        return "SEDEX";
    }

    @Override
    public int getPrazoUteis() {
        return PRAZO_DIAS_UTEIS;
    }
}
