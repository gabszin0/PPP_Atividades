public abstract class Decorador implements Bebida {
    protected Bebida bebida;

    public Decorador(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto();
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao();
    }
}
