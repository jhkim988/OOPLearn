package head_first_design_pattern.ch04factory.pizzastore;

import head_first_design_pattern.ch04factory.pizza.Pizza;

public abstract class PizzaStore {
    
    public Pizza orderPizza(String type) {
        // Pizza pizza = simpleFactory.create(type);
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
