package head_first_design_pattern.ch03decorator;

public abstract class Beverage {
    protected String description;

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
