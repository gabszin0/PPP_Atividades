public class Investidor implements Observer {

    private String nome;
    private double limiteMinimo;
    private double limiteMaximo;
    private AcaoBroker broker;

    public Investidor(String nome, double limiteMinimo, double limiteMaximo, AcaoBroker broker) {
        this.nome = nome;
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
        this.broker = broker;
    }

    @Override
    public void atualizar(Acao acao) {
        double precoAtual = acao.getPreco();
        System.out.println("- " + nome + " analisando " + acao.getSimbolo() + " a R$" + precoAtual);

        if (precoAtual >= limiteMaximo) {
            System.out.println("Limite MÁXIMO atingido! Realizando lucros.");
            broker.vender(nome, acao.getSimbolo(), precoAtual);
        } else if (precoAtual <= limiteMinimo) {
            System.out.println("Limite MÍNIMO atingido! Comprando na baixa.");
            broker.comprar(nome, acao.getSimbolo(), precoAtual);
        }
    }
}