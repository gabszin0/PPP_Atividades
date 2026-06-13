public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento pagamento1 = new CartaoCreditoAdapter(new CartaoCreditoLegado());
        ProcessadorPagamento pagamento2 = new PayPalAdapter(new PayPalLegado());
        ProcessadorPagamento pagamento3 = new BitcoinAdapter(new BitcoinLegado());

        double valor = 150.50;


        if (pagamento1.processar(valor)) {
            System.out.println("Método: " + pagamento1.obterNomeMetodo() + " - Sucesso!\n");
        }

        if (pagamento2.processar(valor)) {
            System.out.println("Método: " + pagamento2.obterNomeMetodo() + " - Sucesso!\n");
        }

        if (pagamento3.processar(valor)) {
            System.out.println("Método: " + pagamento3.obterNomeMetodo() + " - Sucesso!\n");
        }
    }
}
