package head_first_design_pattern.ch12mvc.application;

public class Quackologist implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("옵저버: " + duck + " 이 소리 냈다.");        
    }
    
}
