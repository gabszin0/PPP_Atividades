public interface Observavel {

    void adicionarObserver(Observer observer);

    void removerObserver(Observer observer);

    void notificarObservers();
}
