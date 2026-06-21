public class Motor {
    private boolean ligado;

    public Motor() {
        this.ligado = false;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("  ✓ Motor ligado");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("  ✓ Motor desligado");
    }

    public boolean isLigado() {
        return ligado;
    }
}
