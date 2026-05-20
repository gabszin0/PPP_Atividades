public class AppleFactory implements FabricanteCelular{

    private static AppleFactory instancia;

    private AppleFactory() {}

    public static synchronized AppleFactory getInstance() {
        if (instancia == null) {
            instancia = new AppleFactory();
        }
        return instancia;
    }

    @Override
    public Celular constroiCelular(String modelo) {
        if (modelo.equals("IphoneX") || modelo.equals("IphoneX")) {
            return new Iphone(modelo);
        }
        System.out.println("Apple não fabrica o modelo: " + modelo);
        return null;
    }
}
    
