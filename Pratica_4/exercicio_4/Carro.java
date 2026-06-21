public class Carro {

    private Motor motor;
    private CintodeSeguranca cinto;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public Carro() {
        this.motor = new Motor();
        this.cinto = new CintodeSeguranca();
        this.porta = new Porta();
        this.farol = new Farol();
        this.radio = new Radio();
    }

    public void ligarCarro() {
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizarPreferida();
        System.out.println("Carro pronto para dirigir!\n");
    }

    public void desligarCarro() {
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
        System.out.println("Carro desligado com segurança!\n");
    }

    public void setEstacaoPreferida(String estacao) {
        radio.setEstacaoPreferida(estacao);
    }

    public void exibirStatus() {
        System.out.println("\n--- STATUS DO CARRO ---");
        System.out.println("Motor: " + (motor.isLigado() ? "LIGADO" : "DESLIGADO"));
        System.out.println("Portas: " + (porta.isTrancada() ? "TRANCADAS" : "DESTRANCADAS"));
        System.out.println("Cinto: " + (cinto.isTravado() ? "TRAVADO" : "DESTRAVADO"));
        System.out.println("Farol: " + (farol.isAceso() ? "ACESO" : "APAGADO"));
        System.out.println("Rádio: " + (radio.isLigado() ? "LIGADO" : "DESLIGADO"));
        System.out.println();
    }
    
}
