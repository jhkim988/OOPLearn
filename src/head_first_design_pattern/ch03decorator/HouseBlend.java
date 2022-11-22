package head_first_design_pattern.ch03decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "하우스 블랜드 커피";
    }

    @Override
    public double cost() {
        return 3.1;
    }
    
}
