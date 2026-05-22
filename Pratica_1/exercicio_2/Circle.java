package Pratica_1.exercicio_2;

public class Circle extends Formato {
    
    private float radius;

    public Circle(float  radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public float calculaArea() {
        return (float) (radius * radius * (Math.PI)); 
    }
    
}
