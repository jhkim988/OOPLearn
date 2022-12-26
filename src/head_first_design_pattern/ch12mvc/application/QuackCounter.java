package head_first_design_pattern.ch12mvc.application;

public class QuackCounter implements Quackable {
    Quackable quackable;
    static int numberOfQuacks = 0;
    
    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numberOfQuacks++;        
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        quackable.registerObserver(observer);        
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();        
    }
}
