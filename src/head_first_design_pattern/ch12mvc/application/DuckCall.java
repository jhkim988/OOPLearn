package head_first_design_pattern.ch12mvc.application;

public class DuckCall implements Quackable {
    Observable observable;
    
    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("꽉꽉");
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
