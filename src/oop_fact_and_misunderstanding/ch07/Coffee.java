package oop_fact_and_misunderstanding.ch07;

public class Coffee {
    private String name;
    private int price;
    public Coffee(MenuItem menuItem) {
        this.name = menuItem.getName();
        this.price = menuItem.cost();
    }
}
