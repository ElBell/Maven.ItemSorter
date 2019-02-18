package rocks.zipcode.io;

import rocks.zipcode.io.comparators.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    Item[] items;
    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        Item item1;
        Item item2;
        for (int i = 0; i < items.length-1; i++) {
            for (int j = 1; j < items.length; j++) {
                item1 = items[i];
                item2 = items[j];
                if(comparator.compare(item1, item2) > 0) {
                    items[i] = item2;
                    items[j] = item1;
                }
            }
        }
        return items;
    }


}
