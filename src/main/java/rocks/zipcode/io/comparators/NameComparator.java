package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;


public class NameComparator implements Comparator<Item>{
    public int compare(Item item1, Item item2) {
        return item1.getName().compareTo(item2.getName());
    }
}
