package head_first_design_pattern.ch03decorator;

public class Whip extends CondimentDecorator {
    
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (Size.TALL == size) return cost + .2;
        if (Size.GRANDE == size) return cost + .5;
        if (Size.VENTI == size) return cost + .7;
        return cost;
    }
}
