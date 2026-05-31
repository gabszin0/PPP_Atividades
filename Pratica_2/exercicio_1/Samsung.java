public class Samsung implements Celular{

    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public Samsung(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void fazLigacao(){
        System.out.println("Samsung " + modelo + " Ligando via Facetime...");
    }

    @Override
    public void tiraFoto(){
        System.out.println("Samsung " + modelo + " Tirando Foto...");
    }
}
