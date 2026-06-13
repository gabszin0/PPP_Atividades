public class CartaoCreditoLegado {

    public boolean efetuarCobranca(double montante) {
        if (montante > 0) {
            System.out.println("Cobrança de R$ " + montante + " realizada no cartão de crédito");
            return true;
        }
        return false;
    }
    
}
