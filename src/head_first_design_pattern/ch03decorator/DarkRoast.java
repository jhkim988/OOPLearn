package head_first_design_pattern.ch03decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "다크 로스트";
    }

    @Override
    public double cost() {
        return 4.1;
    }
    
}
