public class Honda implements IVehicle {

    private String modelo;

    public Honda(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public void start() {
        System.out.println("Honda " + modelo + " iniciando o motor...");
    }

    @Override
    public void drive() {
        System.out.println("Honda " + modelo + " em movimento...");
    }

    @Override
    public void stop() {
        System.out.println("Honda " + modelo + " parando...");
    }

}
