public class Main {

    public static void main(String[] args) {
        // Obtém instâncias únicas das factories (Singleton)
        FabricanteCelular appleFactory = AppleFactory.getInstance();
        FabricanteCelular samsungFactory = SamsungFactory.getInstance();

        // Cria celulares Apple usando Factory 
        Celular iphone_x = appleFactory.construirCelular("IphoneX");
        Celular iphone_s = appleFactory.construirCelular("IphoneS");

        // Cria celulares Samsung usando Factory 
        Celular galaxy8 = samsungFactory.construirCelular("Galaxy8");
        Celular galaxy20 = samsungFactory.construirCelular("Galaxy20");

        // Testa os celulares Apple
        System.out.println("=== Testando iPhones ===");
        if (iphone_x != null) {
            iphone_x.fazLigacao();
            iphone_x.tiraFoto();
        }

        if (iphone_s != null) {
            iphone_s.fazLigacao();
            iphone_s.tiraFoto();
        }

        // Testa os celulares Samsung
        System.out.println("\n=== Testando Galaxys ===");
        if (galaxy8 != null) {
            galaxy8.fazLigacao();
            galaxy8.tiraFoto();
        }

        if (galaxy20 != null) {
            galaxy20.fazLigacao();
            galaxy20.tiraFoto();
        }

        // Testa tentativa de criar modelo que não existe
        System.out.println("\n=== Testando modelos inexistentes ===");
        appleFactory.construirCelular("Galaxy10");
        samsungFactory.construirCelular("IphoneZ");
    }

}
