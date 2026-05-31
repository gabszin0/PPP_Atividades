public class Iphone implements Celular {
    
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public Iphone (String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void fazLigacao(){
        System.out.println("Iphone " + modelo + " Ligando via Facetime...");
    }

    @Override
    public void tiraFoto(){
        System.out.println("Iphone " + modelo + " Tirando Foto...");
    }

}
