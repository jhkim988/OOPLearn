package head_first_design_pattern.ch04factory.pizzastore;

import head_first_design_pattern.ch04factory.pizza.ChicagoStyleCheesePizza;
import head_first_design_pattern.ch04factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) return new ChicagoStyleCheesePizza();
        return null;
    }

}
