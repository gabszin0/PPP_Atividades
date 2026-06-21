public class Radio {
    private boolean ligado;
    private String estacaoPreferida;

    public Radio() {
        this.ligado = false;
        this.estacaoPreferida = "FM 105.9";
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("  ✓ Rádio ligado");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("  ✓ Rádio desligado");
    }

    public void sintonizar(String estacao) {
        this.estacaoPreferida = estacao;
        System.out.println("  ✓ Rádio sintonizado em: " + estacao);
    }

    public void sintonizarPreferida() {
        System.out.println("  ✓ Rádio sintonizado em estação preferida: " + estacaoPreferida);
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setEstacaoPreferida(String estacao) {
        this.estacaoPreferida = estacao;
    }
}
