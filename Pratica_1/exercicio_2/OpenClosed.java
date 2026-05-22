package Pratica_1.exercicio_2;

public class OpenClosed {
    
    public OpenClosed(){
        doCorrectImplementation();
    }
    
    public void doCorrectImplementation(){
        
        Rectangle rectangle = new Rectangle(4,3);
        Circle circle = new Circle(5);
        
        System.out.println("Area do retangulo -> " + rectangle.calculaArea());
        System.out.println("Area do circulo -> " + circle.calculaArea());
        
    }
    
    public static void main(String [] args ) {
        OpenClosed opClo = new OpenClosed();
      
    }
    
    
}