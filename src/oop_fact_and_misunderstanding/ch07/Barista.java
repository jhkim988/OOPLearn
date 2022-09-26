package oop_fact_and_misunderstanding.ch07;

public class Barista {
    public Coffee makeCoffee(MenuItem menuItem) {
        System.out.println("make coffee");
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }
}
