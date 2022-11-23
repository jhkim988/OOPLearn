package head_first_design_pattern.ch04factory.pizzastore;

import head_first_design_pattern.ch04factory.ingredient.NYPizzaIngredientFactory;
import head_first_design_pattern.ch04factory.ingredient.PizzaIngredientFactory;
import head_first_design_pattern.ch04factory.pizza.CheesePizza;
import head_first_design_pattern.ch04factory.pizza.ClamPizza;
import head_first_design_pattern.ch04factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 야채 피자");
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 야채 피자");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 조개 피자");
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 페퍼로니 피자");
        }
        return pizza;
    }
}
