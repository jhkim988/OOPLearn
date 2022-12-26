package head_first_design_pattern.ch12mvc.application;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
