package head_first_design_pattern.ch09iterator_composite;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    DinerMenu() {

    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
