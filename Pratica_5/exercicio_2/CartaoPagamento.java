public class CartaoPagamento implements PagamentoStrategy {

    private final String numeroCartao;
    private final String nomeTitular;
    private final int parcelas;

    public CartaoPagamento(String numeroCartao, String nomeTitular, int parcelas) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular  = nomeTitular;
        this.parcelas     = parcelas;
    }

    @Override
    public void pagar(double valor) {
        double valorParcela    = valor / parcelas;

        System.out.println("Pagamento via Cartão de Crédito: ");
        System.out.printf("Titular: %s%n",      nomeTitular);
        System.out.printf("Cartão: %s%n",        numeroCartao);
        System.out.printf("Valor total: R$ %.2f%n", valor);
        System.out.printf("Parcelamento: %dx de R$ %.2f%n", parcelas, valorParcela);
        System.out.println("Pagamento no cartão autorizado! Prazo: próxima fatura.");
    }
}
