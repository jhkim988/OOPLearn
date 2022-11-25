package head_first_design_pattern.ch07adapter_facade.adapter;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("꽥");        
    }

    @Override
    public void fly() {
        System.out.println("날고 있어요!");        
    }
    
}
