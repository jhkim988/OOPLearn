package head_first_design_pattern.ch09iterator_composite;

import java.util.*;

public class PancakeHouseMenu {
    List<MenuItem> menuItems;

    PancakeHouseMenu() {
    }

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}
