package head_first_design_pattern.ch03decorator;

public class Decaf extends Beverage {
    public Decaf() {
        description = "디카페인";
    }

    @Override
    public double cost() {
        return 4.5;
    }
    
}
