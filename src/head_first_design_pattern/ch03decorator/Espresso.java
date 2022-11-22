package head_first_design_pattern.ch03decorator;

public class Espresso extends Beverage {
    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public double cost() {
        return 3.9;
    }
    
}
