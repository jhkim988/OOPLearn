package oop_fact_and_misunderstanding.ch07;

public class MenuItem {
    private String name;
    private int price;
    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int cost() {
        return price;
    }
}
