package head_first_design_pattern.ch12mvc.application;

public class GooseAdapter implements Quackable {
    Observable observable;
    Goose goose;

    GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        goose.honk();
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
