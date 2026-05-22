package Pratica_1.exercicio_3;

public class Penguin implements Bird {
    
    @Override
    public void eat() { System.out.println("Pinguim comendo peixe..."); }

    @Override
    public void sleep() { System.out.println("Pinguim dormindo no gelo..."); }
    
}
