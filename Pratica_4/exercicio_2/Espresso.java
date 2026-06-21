public class Espresso implements Bebida {
    @Override
    public double calculaCusto() {
        return 3.50;
    }

    @Override
    public String getDescricao() {
        return "Espresso";
    }
}
