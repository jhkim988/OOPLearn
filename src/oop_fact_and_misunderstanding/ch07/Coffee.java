package oop_fact_and_misunderstanding.ch07;

public class Coffee {
    private String name;
    private int price;
    public Coffee(MenuItem menuItem) {
        System.out.println("created coffee");
        this.name = menuItem.getName();
        this.price = menuItem.cost();
    }
    @Override
    public String toString() {
        return name + ": " + price;
    }
}
