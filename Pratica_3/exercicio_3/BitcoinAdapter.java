public class BitcoinAdapter implements ProcessadorPagamento {

    private BitcoinLegado bitcoin;

    public BitcoinAdapter(BitcoinLegado bitcoin) {
        this.bitcoin = bitcoin;
    }

    @Override
    public boolean processar(double valor) {
        if (valor > 0) {
            bitcoin.transferirBitcoin((float) valor);
            return true;
        }
        return false;
    }

    @Override
    public String obterNomeMetodo() {
        return "Bitcoin";
    }
    
}
