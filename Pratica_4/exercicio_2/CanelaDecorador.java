public class CanelaDecorador extends Decorador {

    public CanelaDecorador(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.75;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com canela";
    }
    
}
