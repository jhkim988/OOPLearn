package head_first_design_pattern.ch09iterator;

import java.util.*;

public class PancakeHouseIterator implements Iterator {
    List<MenuItem> items;
    int position = 0;
    PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return 0 <= position && position < items.size();
    }

    @Override
    public MenuItem next() {
        return items.get(position++);
    }
    
}
