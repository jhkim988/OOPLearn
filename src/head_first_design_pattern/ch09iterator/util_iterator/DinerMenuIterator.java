package head_first_design_pattern.ch09iterator.util_iterator;

import java.util.Iterator;

import head_first_design_pattern.ch09iterator.MenuItem;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;

    @Override
    public boolean hasNext() {
        return 0 <= position && position < items.length;
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }
    
    @Override
    public void remove() {
        // default 메서드로 정의돼 있다.
        throw new UnsupportedOperationException("메뉴 항목은 지우면 안됩니다.");
    }
}
