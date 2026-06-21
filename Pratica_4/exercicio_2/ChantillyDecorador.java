public class ChantillyDecorador extends Decorador {
    
    public ChantillyDecorador(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 1.00;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com chantilly";
    }
    
}
