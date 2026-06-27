public class AcaoBroker {

    public void vender(String investidor, String simboloAcao, double preco) {
        System.out.println("[BROKER] Executando VENDA de " + simboloAcao + " para " + investidor + " por R$" + preco);
    }

    public void comprar(String investidor, String simboloAcao, double preco) {
        System.out.println("[BROKER] Executando COMPRA de " + simboloAcao + " para " + investidor + " por R$" + preco);
    }

}
