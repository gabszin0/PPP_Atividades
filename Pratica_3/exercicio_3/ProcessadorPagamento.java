public interface ProcessadorPagamento {

    boolean processar(double valor);
    String obterNomeMetodo();
    
}
