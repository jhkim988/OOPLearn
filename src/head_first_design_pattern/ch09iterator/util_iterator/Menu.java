package head_first_design_pattern.ch09iterator.util_iterator;

import java.util.Iterator;

import head_first_design_pattern.ch09iterator.MenuItem;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
