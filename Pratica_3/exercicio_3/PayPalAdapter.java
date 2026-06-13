public class PayPalAdapter implements ProcessadorPagamento {
    private PayPalLegado paypal;

    public PayPalAdapter(PayPalLegado paypal) {
        this.paypal = paypal;
    }

    @Override
    public boolean processar(double valor) {
        return paypal.enviarPagamento(valor) == 1;
    }

    @Override
    public String obterNomeMetodo() {
        return "PayPal";
    }
}
