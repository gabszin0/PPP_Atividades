public class SamsungFactory implements FabricanteCelular {
    
    private static SamsungFactory instancia;

    private SamsungFactory() {}

    public static synchronized SamsungFactory getInstance() {
        if (instancia == null) {
            instancia = new SamsungFactory();
        }
        return instancia;
    }

    @Override
    public Celular construirCelular(String modelo) {
        if (modelo.equals("Galaxy8") || modelo.equals("Galaxy20")) {
            return new Samsung(modelo);
        }
        System.out.println("Samsung não fabrica o modelo: " + modelo);
        return null;
    }

}
