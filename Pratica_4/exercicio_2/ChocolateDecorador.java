public class ChocolateDecorador extends Decorador {
    
    public ChocolateDecorador(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 1.25;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com chocolate";
    }

}
