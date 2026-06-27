public class Main {

    public static void main(String[] args) {


        System.out.println("Cenário 1 — PIX + SEDEX: ");

        CarrinhoCompras carrinho = new CarrinhoCompras();
        reabastece(carrinho);

        carrinho.setPagamentoStrategy(new PixPagamento("pagamentos@loja.com"));
        carrinho.setFreteStrategy(new SedexFrete());

        carrinho.exibeCarrinho();
        System.out.println();
        carrinho.realizaPagamento();

     

        System.out.println("Cenário 2 — PIX + NORMAL (PAC): ");

        reabastece(carrinho);

        carrinho.setPagamentoStrategy(new PixPagamento("pagamentos@loja.com"));
        carrinho.setFreteStrategy(new NormalFrete());

        carrinho.exibeCarrinho();
        System.out.println();
        carrinho.realizaPagamento();



        System.out.println("Cenário 3 — CARTÃO 6× + SEDEX ");

        reabastece(carrinho);

        carrinho.setPagamentoStrategy(
                new CartaoPagamento("4111111111111234", "Ana Paula Souza", 6));
        carrinho.setFreteStrategy(new SedexFrete());

        carrinho.exibeCarrinho();
        System.out.println();
        carrinho.realizaPagamento();



        System.out.println("Cenário 4 — BOLETO + NORMAL (PAC): ");

        reabastece(carrinho);

        carrinho.setPagamentoStrategy(new BoletoPagamento("123.456.789-00"));
        carrinho.setFreteStrategy(new NormalFrete());

        carrinho.exibeCarrinho();
        System.out.println();
        carrinho.realizaPagamento();



        System.out.println("Cenário 5 — Comparativo de frete (sem finalizar): ");

        CarrinhoCompras simulacao = new CarrinhoCompras();
        simulacao.adicionaItem(new Item("Geladeira Consul 400L", 2_899.90, 1, 48.0));
        simulacao.adicionaItem(new Item("Micro-ondas Electrolux",  599.90, 1,  9.5));

        System.out.println("\n--- Simulação SEDEX ---");
        simulacao.setFreteStrategy(new SedexFrete());
        double freteSedex = simulacao.calculaFrete();

        System.out.println("\n--- Simulação Normal (PAC) ---");
        simulacao.setFreteStrategy(new NormalFrete());
        double freteNormal = simulacao.calculaFrete();

        System.out.printf("%nDiferença de frete: R$ %.2f (escolha Normal para economizar)%n",
                freteSedex - freteNormal);
    }

    

    private static void reabastece(CarrinhoCompras carrinho) {
        // Item(nome, preço, quantidade, pesoKg)
        carrinho.adicionaItem(new Item("Notebook ",  3_499.90, 1, 2.50));
        carrinho.adicionaItem(new Item("Mouse ",      89.90, 2, 0.12));
        carrinho.adicionaItem(new Item("Teclado ",    349.90, 1, 0.95));
        carrinho.adicionaItem(new Item("Monitor ",    999.90, 1, 4.80));
    }
}
