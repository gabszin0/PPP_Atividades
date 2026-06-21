public class Cafeteria {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CAFETERIA - PADRÃO DECORATOR ===\n");

        // Bebida 1: Espresso simples
        Bebida bebida1 = new Espresso();
        exibeBebida(bebida1);

        // Bebida 2: Espresso com leite
        Bebida bebida2 = new LeiteDecorador(new Espresso());
        exibeBebida(bebida2);

        // Bebida 3: Espresso com leite e canela
        Bebida bebida3 = new CanelaDecorador(new LeiteDecorador(new Espresso()));
        exibeBebida(bebida3);

        // Bebida 4: Espresso com leite, canela e chocolate
        Bebida bebida4 = new ChocolateDecorador(
            new CanelaDecorador(new LeiteDecorador(new Espresso()))
        );
        exibeBebida(bebida4);

        System.out.println();

        // Bebida 5: Decaf simples
        Bebida bebida5 = new Decaf();
        exibeBebida(bebida5);

        // Bebida 6: Decaf com chocolate
        Bebida bebida6 = new ChocolateDecorador(new Decaf());
        exibeBebida(bebida6);

        // Bebida 7: Decaf com chocolate e chantilly
        Bebida bebida7 = new ChantillyDecorador(new ChocolateDecorador(new Decaf()));
        exibeBebida(bebida7);

        System.out.println();

        // Bebida 8: Espresso com caramelo, leite e chantilly
        Bebida bebida8 = new ChantillyDecorador(
            new LeiteDecorador(new CarameloDecorador(new Espresso()))
        );
        exibeBebida(bebida8);

        System.out.println();
        System.out.println("=== FIM DO SISTEMA ===");
    }

    private static void exibeBebida(Bebida bebida) {
        System.out.println("Descrição: " + bebida.getDescricao());
        System.out.printf("Custo: R$ %.2f%n", bebida.calculaCusto());
        System.out.println();
    }
}
