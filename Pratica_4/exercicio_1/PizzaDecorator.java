public class PizzaDecorator implements Pizza {
    
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescricao(){
        return pizza.getDescricao();
    }

    @Override
    public double getPreco(){
        return pizza.getPreco();
        
    }
}
