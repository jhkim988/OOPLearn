package head_first_design_pattern.ch04factory;

import java.util.*;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();
    
    public void prepare() {
        System.out.println("prepare pizza: " + name);
        System.out.println("topping: ");
        toppings.stream().forEach(System.out::println);
    }

    public void bake() {
        System.out.println();
    }

    public void cut() {

    }

    public void box() {

    }

    public String getName() {
        return name;
    }
}
