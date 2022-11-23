package head_first_design_pattern.ch03decorator;

public class Espresso extends Beverage {
    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public double cost() {
        double cost = 3.9;
        if (Size.TALL == size) return cost + .5;
        if (Size.GRANDE == size) return cost + 1.0;
        if (Size.VENTI == size) return cost + 1.5;
        return cost;
    }
    
}
