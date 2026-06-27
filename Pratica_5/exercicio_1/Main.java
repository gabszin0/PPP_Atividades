public class Main {

    public static void main(String[] args) {

        CarrinhoCompras carrinho1 = new CarrinhoCompras();
        CarrinhoCompras carrinho2 = new CarrinhoCompras();
        CarrinhoCompras carrinho3 = new CarrinhoCompras();

        carrinho1.adicionaItem(new Item("Notebook ",  500, 1));
        
        System.out.println();
        carrinho1.exibeCarrinho();

        System.out.println("\nPagamento por Pix\n");
        carrinho1.setPagamentoStrategy(new PixPagamento("pagamentos@loja.com"));

        carrinho1.realizaPagamento();



        carrinho2.adicionaItem(new Item("Mouse ",      90, 2));

        System.out.println("\n Pagamento por Cartão de Crédito (3×) \n");
        carrinho2.setPagamentoStrategy(
                new CartaoPagamento("4111111111111234", "Ana Paula Souza", 3));

        carrinho2.realizaPagamento();
        


        carrinho3.adicionaItem(new Item("Teclado ",    70, 1));

        System.out.println("\n Pagamento com Boleto \n");
        carrinho3.setPagamentoStrategy(new BoletoPagamento("123.456.789-00"));

        carrinho3.realizaPagamento();



        System.out.println("\nDemonstração de removeItem: \n");
        CarrinhoCompras carrinho4 = new CarrinhoCompras();
        carrinho4.adicionaItem(new Item("Fone de ouvido",  25, 1));
        carrinho4.removeItem("Fone de ouvido");        
        carrinho4.removeItem("Produto Inexistente"); 
        System.out.println();
        carrinho4.exibeCarrinho();
    }

}