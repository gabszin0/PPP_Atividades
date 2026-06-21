public class Farol {

    private boolean aceso;

    public Farol() {
        this.aceso = false;
    }

    public void acender() {
        this.aceso = true;
        System.out.println(" Farol aceso");
    }

    public void apagar() {
        this.aceso = false;
        System.out.println(" Farol apagado");
    }

    public boolean isAceso() {
        return aceso;
    }

}
