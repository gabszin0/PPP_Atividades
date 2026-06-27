import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CentralEstacaoTempo implements Observavel {

    private double temperatura;       // graus Celsius
    private double umidade;           // percentual (0–100)
    private double velocidadeVento;   // km/h

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void adicionarObserver(Observer observer) {
        if (observer == null) throw new IllegalArgumentException("Observer não pode ser nulo.");
        if (!observers.contains(observer)) {
            observers.add(observer);
            System.out.printf("[CET] Observer inscrito: %s%n",
                    observer.getClass().getSimpleName());
        }
    }

    @Override
    public void removerObserver(Observer observer) {
        boolean removido = observers.remove(observer);
        if (removido) {
            System.out.printf("[CET] Observer removido: %s%n",
                    observer.getClass().getSimpleName());
        }
    }

    @Override
    public void notificarObservers() {
        System.out.printf("%n[CET] Notificando %d observer(s) → "
                + "Temp: %.1f°C | Umidade: %.1f%% | Vento: %.1f km/h%n",
                observers.size(), temperatura, umidade, velocidadeVento);
        for (Observer o : observers) {
            o.atualizar(temperatura, umidade, velocidadeVento);
        }
    }


    public void setDados(double temperatura, double umidade, double velocidadeVento) {
        this.temperatura     = temperatura;
        this.umidade         = umidade;
        this.velocidadeVento = velocidadeVento;
        notificarObservers();
    }


    public double getTemperatura()     { return temperatura; }
    public double getUmidade()         { return umidade; }
    public double getVelocidadeVento() { return velocidadeVento; }


    public List<Observer> getObservers() {
        return Collections.unmodifiableList(observers);
    }

}
