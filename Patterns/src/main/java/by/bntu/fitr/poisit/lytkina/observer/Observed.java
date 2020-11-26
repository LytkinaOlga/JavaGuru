package by.bntu.fitr.poisit.lytkina.observer;

public interface Observed {
    public void addObserver (Observer observer);
    public void removeObserver (Observer observer);
    public void notifyObservers ();
}
