package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

public interface Comparator<Item> {
    Integer compare(Item item1, Item item2);
}
