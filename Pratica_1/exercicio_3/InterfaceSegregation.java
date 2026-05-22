package Pratica_1.exercicio_3;

    public class InterfaceSegregation {
    
    public InterfaceSegregation() {
        doCorrectImplementation();
    }

    public void doCorrectImplementation() {
        
        Crow crow = new Crow();
        Penguin penguin = new Penguin();
        
        crow.eat();
        crow.sleep();
        crow.fly();
        
        penguin.eat();
        penguin.sleep();
    
    }
    
    public static void main(String [] args) {
        InterfaceSegregation is = new InterfaceSegregation();
    }
    
}

