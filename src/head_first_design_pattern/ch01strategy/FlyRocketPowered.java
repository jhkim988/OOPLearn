package head_first_design_pattern.ch01strategy;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("로켓 타고 날아갑니다.");        
    }
    
}
