public class Toyota implements IVehicle {

    private String modelo;

    public Toyota(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public void start() {
        System.out.println("Toyota " + modelo + " iniciando o motor...");
    }

    @Override
    public void drive() {
        System.out.println("Toyota " + modelo + " em movimento...");
    }

    @Override
    public void stop() {
        System.out.println("Toyota " + modelo + " parando...");
    }

}
