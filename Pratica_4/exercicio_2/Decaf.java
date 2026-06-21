public class Decaf implements Bebida {
    @Override
    public double calculaCusto() {
        return 3.00;
    }

    @Override
    public String getDescricao() {
        return "Decaf";
    }
}
