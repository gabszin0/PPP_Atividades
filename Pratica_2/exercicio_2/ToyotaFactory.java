public class ToyotaFactory implements IVehicleMaker {

    private static ToyotaFactory instancia;

    private ToyotaFactory() {}

    public static synchronized ToyotaFactory getInstance() {
        if (instancia == null) {
            instancia = new ToyotaFactory();
        }
        return instancia;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        if (modelo.equals("Corolla") || modelo.equals("Hilux") || modelo.equals("Etios")) {
            return new Toyota(modelo);
        }
        System.out.println("Toyota não fabrica o modelo: " + modelo);
        return null;
    }

}
