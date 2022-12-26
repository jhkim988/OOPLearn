package head_first_design_pattern.ch12mvc.application;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    Observable observable;
    List<Quackable> quackers = new ArrayList<>();

    public Flock() {
        observable = new Observable(this);
    }

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        quackers.forEach(quacker -> quacker.quack());
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        quackers.forEach(quacker -> quacker.registerObserver(observer));        
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();        
    }
    

}
