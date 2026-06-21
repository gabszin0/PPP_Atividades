public class CintodeSeguranca {

    private boolean travado;

    public CintodeSeguranca() {
        this.travado = false;
    }

    public void travar() {
        this.travado = true;
        System.out.println("Cinto de segurança travado");
    }

    public void destravar() {
        this.travado = false;
        System.out.println("Cinto de segurança destravado");
    }

    public boolean isTravado() {
        return travado;
    }
    
}
