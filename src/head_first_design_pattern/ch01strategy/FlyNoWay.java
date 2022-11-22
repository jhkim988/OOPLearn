package head_first_design_pattern.ch01strategy;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날지 못한다 :(");        
    }
    
}
