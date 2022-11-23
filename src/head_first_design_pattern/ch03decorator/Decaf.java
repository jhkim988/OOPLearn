package head_first_design_pattern.ch03decorator;

public class Decaf extends Beverage {
    public Decaf() {
        description = "디카페인";
    }

    @Override
    public double cost() {
        double cost = 4.5;
        if (Size.TALL == size) return cost + .5;
        if (Size.GRANDE == size) return cost + 1.0;
        if (Size.VENTI == size) return cost + 1.5;
        return cost;
    }
    
}
