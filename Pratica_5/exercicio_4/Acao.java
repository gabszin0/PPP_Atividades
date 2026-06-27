import java.util.ArrayList;
import java.util.List;

public class Acao {

    private String simbolo;
    private double preco;
    private List<Observer> investidores = new ArrayList<>();

    public Acao(String simbolo, double preco) {
        this.simbolo = simbolo;
        this.preco = preco;
    }

    public void adicionarInvestidor(Observer investidor) {
        investidores.add(investidor);
    }

    public void removerInvestidor(Observer investidor) {
        investidores.remove(investidor);
    }

    public void setPreco(double novoPreco) {
        System.out.println("\n MERCADO: Ação " + simbolo + " mudou para R$" + novoPreco);
        this.preco = novoPreco;
        notificarInvestidores(); 
    }

    private void notificarInvestidores() {
        for (Observer investidor : investidores) {
            investidor.atualizar(this);
        }
    }

    public String getSimbolo() { 
        return simbolo; 
    }

    public double getPreco() { 
        return preco; 
    }

}
