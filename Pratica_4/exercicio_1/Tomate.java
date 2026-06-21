public class Tomate extends PizzaDecorator{
    
    public Tomate(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescricao(){
        String descricaoSemTomate = super.getDescricao();
        return  descricaoSemTomate + " tomate";
    }

    @Override
    public double getPreco(){
        double precoSemTomate = super.getPreco();
        return precoSemTomate + 10;
    }
}
