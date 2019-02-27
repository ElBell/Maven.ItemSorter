package rocks.zipcode.io;

import java.util.*;


public class ItemSorter {
    private Item[] items;
    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        Arrays.sort(items, comparator);
        return items;
    }

}
