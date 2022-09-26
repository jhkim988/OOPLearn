package oop_fact_and_misunderstanding.ch07;

import java.util.*;

public class Menu {
    private List<MenuItem> items = new ArrayList<>();
    public MenuItem chosse(String name) {
        System.out.println("choose: " + name);
        for (MenuItem each : items) {
            if (each.getName().equals(name)) return each;
        }
        return null;
    }
    public void addItem(String name, int price) {
        System.out.println("add menuItem: " + name + "-" + price);
        MenuItem menuItem = new MenuItem(name, price);
        items.add(menuItem);
    }
}
