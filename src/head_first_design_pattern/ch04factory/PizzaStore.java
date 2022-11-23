package head_first_design_pattern.ch04factory;

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
