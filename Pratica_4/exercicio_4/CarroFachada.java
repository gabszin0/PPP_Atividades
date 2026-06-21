public class CarroFachada {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setEstacaoPreferida("FM 89.5");

        carro.exibirStatus();

        carro.ligarCarro();

        carro.exibirStatus();

        carro.desligarCarro();

        carro.exibirStatus();

    }
    
}
