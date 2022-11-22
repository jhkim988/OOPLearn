package head_first_design_pattern.ch03decorator;

public abstract class Beverage {
    public enum Size {  TALL, GRANDE, VENTI };
    protected Size size = Size.TALL;
    protected String description;

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    
    public Size getSize() {
        return this.size;
    }
}
