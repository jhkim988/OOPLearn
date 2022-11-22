package head_first_design_pattern.ch01strategy;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날개를 이용해서 날아요 :)");        
    }
    
}
