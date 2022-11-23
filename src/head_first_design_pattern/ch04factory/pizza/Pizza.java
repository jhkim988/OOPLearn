package head_first_design_pattern.ch04factory.pizza;

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
        System.out.println("175도에서 25분간 굽기");
    }

    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    public void box() {
        System.out.println("상자에 피자 담기");
    }

    public String getName() {
        return name;
    }
}
