package Pratica_1.exercicio_2;

public class Rectangle extends Formato {

    private float height, width;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
    
    @Override
    public float calculaArea() {
        return (float) (height * width); 
    }

}
