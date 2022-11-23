package head_first_design_pattern.ch03decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "하우스 블랜드 커피";
    }

    @Override
    public double cost() {
        double cost = 3.1;
        if (Size.TALL == size) return cost + .5;
        if (Size.GRANDE == size) return cost + 1.0;
        if (Size.VENTI == size) return cost + 1.5;
        return cost;
    }
    
}
