package head_first_design_pattern.ch04factory;

import head_first_design_pattern.ch04factory.pizza.Pizza;
import head_first_design_pattern.ch04factory.pizzastore.ChicagoPizzaStore;
import head_first_design_pattern.ch04factory.pizzastore.NYPizzaStore;
import head_first_design_pattern.ch04factory.pizzastore.PizzaStore;

public class PizzaTestDriver {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("에단이 주문한 " + pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("조엘이 주문한 " + pizza.getName());
    }
}
