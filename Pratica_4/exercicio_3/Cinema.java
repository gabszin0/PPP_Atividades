package Pratica_4.exercicio_3;

public class Cinema {
    
    Pipoqueira pipo = new Pipoqueira();
    Luzes luzes = new Luzes();
    Telao telao = new Telao();
    Projetor projetor = new Projetor();
    Amplificador amp = new Amplificador();
    Player player = new Player();

    public void rotina(){
        
        pipo.liga();
        pipo.rebenta();
        luzes.desliga();
        telao.abaixa();
        projetor.liga();
        amp.liga();
        amp.volume(10);
        player.liga();
        player.play();
        
    }

}
