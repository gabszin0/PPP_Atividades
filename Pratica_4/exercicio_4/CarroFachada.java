public class CarroFachada {
    public static void main(String[] args) {
        System.out.println("═════════════════════════════════════════════════");
        System.out.println("  PADRÃO FACADE - SISTEMA DE CONTROLE DE CARRO");
        System.out.println("═════════════════════════════════════════════════");

        Carro carro = new Carro();

        carro.setEstacaoPreferida("FM 89.5");

        carro.exibirStatus();

        carro.ligarCarro();

        carro.exibirStatus();

        System.out.println("--- DIRIGINDO O CARRO ---");
        System.out.println("O carro está pronto para rodar!");
        System.out.println();

        carro.desligarCarro();

        carro.exibirStatus();

        System.out.println("═════════════════════════════════════════════════");
        System.out.println("  O padrão Facade simplifica a interação com");
        System.out.println("  vários subsistemas em uma única interface!");
        System.out.println("═════════════════════════════════════════════════");
    }
}
