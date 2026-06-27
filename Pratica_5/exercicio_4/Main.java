public class Main {
    public static void main(String[] args) {
    AcaoBroker corretor = new AcaoBroker();
        
        Acao petr4 = new Acao("PETR4", 25.00);
        
        Investidor investidor1 = new Investidor("João", 22.00, 30.00, corretor);
        Investidor investidor2 = new Investidor("Maria", 24.00, 28.00, corretor);
        
        petr4.adicionarInvestidor(investidor1);
        petr4.adicionarInvestidor(investidor2);
        
        // Simulando as flutuações loucas do mercado
        petr4.setPreco(26.00); 
        petr4.setPreco(28.50); 
        petr4.setPreco(21.00); 
        petr4.setPreco(31.00); 
    }
}