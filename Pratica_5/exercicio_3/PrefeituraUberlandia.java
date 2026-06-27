public class PrefeituraUberlandia implements Observer {

    private static final double LIMIAR_VERMELHO = 12.0;
    private static final double LIMIAR_LARANJA  = 20.0;
    private static final double LIMIAR_AMARELO  = 30.0;

    private double ultimaUmidade = -1;

    @Override
    public void atualizar(double temperatura, double umidade, double velocidadeVento) {
        this.ultimaUmidade = umidade;
        System.out.printf("  [Prefeitura UDI] Umidade recebida: %.1f%%%n", umidade);
        emitirAlerta(umidade);
    }


    private void emitirAlerta(double umidade) {
        if (umidade < LIMIAR_VERMELHO) {
            System.out.println("  [Prefeitura UDI] *** ALERTA VERMELHO (Defesa Civil): "
                    + "umidade CRÍTICA — risco elevado à saúde. "
                    + "Evite exposição ao sol e mantenha-se hidratado. ***");
        } else if (umidade < LIMIAR_LARANJA) {
            System.out.println("  [Prefeitura UDI] *** ALERTA LARANJA (Defesa Civil): "
                    + "umidade MUITO BAIXA — atenção redobrada. "
                    + "Beba água e umidifique ambientes. ***");
        } else if (umidade < LIMIAR_AMARELO) {
            System.out.println("  [Prefeitura UDI] *** ALERTA AMARELO (Defesa Civil): "
                    + "umidade BAIXA — mantenha-se hidratado. ***");
        } else {
            System.out.println("  [Prefeitura UDI] Umidade dentro do nível seguro. "
                    + "Nenhum alerta emitido.");
        }
    }

    public double getUltimaUmidade() { return ultimaUmidade; }
    
}
