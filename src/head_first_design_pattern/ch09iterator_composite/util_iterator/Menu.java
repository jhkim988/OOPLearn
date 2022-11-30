package head_first_design_pattern.ch09iterator_composite.util_iterator;

import java.util.Iterator;

import head_first_design_pattern.ch09iterator_composite.MenuItem;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
