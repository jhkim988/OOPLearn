package head_first_design_pattern.ch12mvc.application;

public class RedheadDuck implements Quackable {
    Observable observable;

    RedheadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("꽥꽥");
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
