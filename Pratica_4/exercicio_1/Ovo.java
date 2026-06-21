public class Ovo extends PizzaDecorator{

    public Ovo(Pizza pizza){
        super(pizza);
    }
    
    @Override
    public String getDescricao(){
        String descricaoSemOvo = super.getDescricao();
        return descricaoSemOvo + " ovo";
    }
    @Override
    public double getPreco(){
        double custoSemOvo = super.getPreco();
        return custoSemOvo + 2.50;
    }
    
}
