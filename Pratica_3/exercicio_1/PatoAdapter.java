public class PatoAdapter implements Ave{
    
    private Pato pato;

    public PatoAdapter(Pato p) {
        this.pato = p;
    }

    @Override
    public void emitirSom(){
        System.out.println("Pato esta cantando...");
    }

    @Override
    public void voar(){
        System.out.println("Pato esta voando...");
    }

}
