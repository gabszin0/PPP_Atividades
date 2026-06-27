public class PixPagamento implements PagamentoStrategy {

    private final String chavePix;

    public PixPagamento(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via Pix: ");
        System.out.printf("Chave Pix: %s%n", chavePix);
        System.out.printf("Valor: R$ %.2f%n", valor);
        System.out.println("Pagamento via Pix confirmado! Prazo: imediato.");
    }
}
