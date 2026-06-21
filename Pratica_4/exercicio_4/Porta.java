public class Porta {

    private boolean trancada;

    public Porta() {
        this.trancada = false;
    }

    public void trancar() {
        this.trancada = true;
        System.out.println("  Portas trancadas");
    }

    public void destrancar() {
        this.trancada = false;
        System.out.println("  Portas destrancadas");
    }

    public boolean isTrancada() {
        return trancada;
    }

}
