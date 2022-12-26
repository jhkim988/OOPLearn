package head_first_design_pattern.ch12mvc.application;

public class RubberDuck implements Quackable {
    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("삑삑");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);        
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();        
    }
}
