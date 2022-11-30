package head_first_design_pattern.ch09iterator_composite.util_iterator;

import java.util.*;

import head_first_design_pattern.ch09iterator_composite.MenuItem;

public class CafeMenu implements Menu {
    Map<String, MenuItem> menuItems = new HashMap<>();
    
    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.put(name, new MenuItem(name, description, vegetarian, price));
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
    
}
