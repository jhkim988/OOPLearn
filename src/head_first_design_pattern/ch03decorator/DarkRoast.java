package head_first_design_pattern.ch03decorator;

public class DarkRoast extends Beverage {
    public DarkRoast(Size size) {
        this.description = "다크 로스트";
        this.size = size;
    }

    @Override
    public double cost() {
        double cost = 4.1;
        if (size == Size.TALL) {
            return cost + 0.1;
        } else if (size == Size.GRANDE) {
            return cost + 0.15;
        } else if (size == Size.VENTI) {
            return cost + 0.2;
        }
        return cost;
    }
    
}
