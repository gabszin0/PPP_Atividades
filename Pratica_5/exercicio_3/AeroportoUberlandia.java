public class AeroportoUberlandia implements Observer {

    private static final double LIMIAR_CRITICO   = 65.0;
    private static final double LIMIAR_ATENCAO   = 45.0;
    private static final double LIMIAR_MODERADO  = 25.0;

    private double ultimoVento = -1;

    @Override
    public void atualizar(double temperatura, double umidade, double velocidadeVento) {
        this.ultimoVento = velocidadeVento;
        System.out.printf("  [Aeroporto UDI] Rajada recebida: %.1f km/h%n", velocidadeVento);
        avaliarOperacoes(velocidadeVento);
    }


    private void avaliarOperacoes(double vento) {
        if (vento > LIMIAR_CRITICO) {
            System.out.println("  [Aeroporto UDI] *** OPERAÇÕES SUSPENSAS: "
                    + "rajadas CRÍTICAS (" + vento + " km/h). "
                    + "Todos os voos aguardando em solo. ***");
        } else if (vento > LIMIAR_ATENCAO) {
            System.out.println("  [Aeroporto UDI] *** RESTRIÇÃO OPERACIONAL: "
                    + "rajadas FORTES (" + vento + " km/h). "
                    + "Apenas aeronaves de grande porte autorizadas. ***");
        } else if (vento > LIMIAR_MODERADO) {
            System.out.println("  [Aeroporto UDI] Vento MODERADO (" + vento + " km/h). "
                    + "Monitoramento especial ativo. Operações normais com atenção.");
        } else {
            System.out.println("  [Aeroporto UDI] Vento favorável (" + vento + " km/h). "
                    + "Operações normais.");
        }
    }

    public double getUltimoVento() { return ultimoVento; }
}
