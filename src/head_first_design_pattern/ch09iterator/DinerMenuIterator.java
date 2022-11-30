package head_first_design_pattern.ch09iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return 0 <= position && position < items.length;
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }
    
}
