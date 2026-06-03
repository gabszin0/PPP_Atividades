public class PavaoAdapter implements Ave{
    
    private Pavao pavao;

    public PavaoAdapter(Pavao pav) {
        this.pavao = p;
    }

    @Override
    public void emitirSom(){
        pavao.cantar();
    }


}
