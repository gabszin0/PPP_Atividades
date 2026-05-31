public class HondaFactory implements IVehicleMaker {

    private static HondaFactory instancia;

    private HondaFactory() {}

    public static synchronized HondaFactory getInstance() {
        if (instancia == null) {
            instancia = new HondaFactory();
        }
        return instancia;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        if (modelo.equals("City") || modelo.equals("Civic") || modelo.equals("Fit")) {
            return new Honda(modelo);
        }
        System.out.println("Honda não fabrica o modelo: " + modelo);
        return null;
    }

}
