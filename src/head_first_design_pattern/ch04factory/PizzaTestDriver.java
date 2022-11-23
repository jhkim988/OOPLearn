package head_first_design_pattern.ch04factory;

public class PizzaTestDriver {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        // PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza);
    }
}
