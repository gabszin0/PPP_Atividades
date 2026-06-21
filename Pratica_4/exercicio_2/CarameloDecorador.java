public class CarameloDecorador extends Decorador {
    
    public CarameloDecorador(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.90;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com calda de caramelo";
    }
    
}
