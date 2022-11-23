package head_first_design_pattern.ch04factory;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) return new NYStyleCheesePizza();
        if ("veggie".equals(type)) return new NYStyleVeggiePizza();
        if ("clam".equals(type)) return new NYStyleClamPizza();
        if ("pepperoni".equals(type)) return new NYStylePepperoniPizza();
        return null;
    }
    
}
