package oop_fact_and_misunderstanding.ch07;

public class Customer {
    public void order(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.chosse(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);
    }
}
