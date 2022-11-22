package head_first_design_pattern.ch01strategy;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("삑삑");        
    }
    
}
