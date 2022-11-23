package head_first_design_pattern.ch04factory.pizza;

import java.util.*;

import head_first_design_pattern.ch04factory.ingredient.Cheese;
import head_first_design_pattern.ch04factory.ingredient.Clams;
import head_first_design_pattern.ch04factory.ingredient.Dough;
import head_first_design_pattern.ch04factory.ingredient.Pepperoni;
import head_first_design_pattern.ch04factory.ingredient.Sauce;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;
    
    public abstract void prepare();

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

    public void setName(String name) {
        this.name = name;
    }
}
