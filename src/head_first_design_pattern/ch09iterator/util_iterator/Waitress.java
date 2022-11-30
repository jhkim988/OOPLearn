package head_first_design_pattern.ch09iterator.util_iterator;

import java.util.*;

import head_first_design_pattern.ch09iterator.MenuItem;

public class Waitress {
    List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        menus.forEach(menu -> printMenu(menu.createIterator()));
    }

    private void printMenu(Iterator<MenuItem> iter) {
        while (iter.hasNext()) {
            MenuItem item = iter.next();
            System.out.println(item.getName() + ", " + item.getPrice() + "--" + item.getDescription()); 
        }
    }
}
