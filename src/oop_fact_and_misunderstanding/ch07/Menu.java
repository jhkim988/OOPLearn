package oop_fact_and_misunderstanding.ch07;

import java.util.List;

public class Menu {
    private List<MenuItem> items;
    public MenuItem chosse(String name) {
        for (MenuItem each : items) {
            if (each.getName().equals(name)) return each;
        }
        return null;
    }
}
