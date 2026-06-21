public class Main {
        
    public static void main(String ... args){
        
        PizzaDecorator pizza1 = new Ovo(new Tomate(new MassaFina()));
        System.out.println(pizza1.getPreco());
        System.out.println(pizza1.getDescricao());
        
        PizzaDecorator pizza2 = new Ovo(new Tomate(new MassaEspessa()));
        System.out.println(pizza2.getPreco());
        System.out.println(pizza2.getDescricao());
    }
    
}
