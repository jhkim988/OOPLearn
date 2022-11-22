package head_first_design_pattern.ch01strategy;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("소리를 못 낸다.");        
    }
    
}
