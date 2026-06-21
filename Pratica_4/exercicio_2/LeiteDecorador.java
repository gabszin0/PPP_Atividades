public class LeiteDecorador extends Decorador {
    public LeiteDecorador(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 1.50;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com leite";
    }
}
