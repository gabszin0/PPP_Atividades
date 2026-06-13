public class CartaoCreditoAdapter implements ProcessadorPagamento {
    private CartaoCreditoLegado cartao;

    public CartaoCreditoAdapter(CartaoCreditoLegado cartao) {
        this.cartao = cartao;
    }

    @Override
    public boolean processar(double valor) {
        return cartao.efetuarCobranca(valor);
    }

    @Override
    public String obterNomeMetodo() {
        return "Cartão de Crédito";
    }
}
