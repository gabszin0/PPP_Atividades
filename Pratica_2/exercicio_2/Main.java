public class Main {

    public static void main(String[] args) {
        IVehicleMaker toyotaFactory = ToyotaFactory.getInstance();
        IVehicleMaker hondaFactory = HondaFactory.getInstance();

        // Cria veículos Toyota usando Factory 
        IVehicle corolla = toyotaFactory.makeVehicle("Corolla");
        IVehicle hilux = toyotaFactory.makeVehicle("Hilux");
        IVehicle etios = toyotaFactory.makeVehicle("Etios");

        // Cria veículos Honda usando Factory 
        IVehicle city = hondaFactory.makeVehicle("City");
        IVehicle civic = hondaFactory.makeVehicle("Civic");
        IVehicle fit = hondaFactory.makeVehicle("Fit");

        // Testa os veículos Toyota
        System.out.println("=== Testando Toyotas ===");
        if (corolla != null) {
            corolla.start();
            corolla.drive();
            corolla.stop();
        }

        if (hilux != null) {
            hilux.start();
            hilux.drive();
            hilux.stop();
        }

        if (etios != null) {
            etios.start();
            etios.drive();
            etios.stop();
        }

        // Testa os veículos Honda
        System.out.println("\n=== Testando Hondas ===");
        if (city != null) {
            city.start();
            city.drive();
            city.stop();
        }

        if (civic != null) {
            civic.start();
            civic.drive();
            civic.stop();
        }

        if (fit != null) {
            fit.start();
            fit.drive();
            fit.stop();
        }

        // Testa tentativa de criar modelo que não existe
        System.out.println("\n=== Testando modelos inexistentes ===");
        toyotaFactory.makeVehicle("Camry");
        hondaFactory.makeVehicle("Accord");
    }

}
