package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item>{
    public Integer compare(Item item1, Item item2) {
        if (item1.getPrice() == item2.getPrice()) {
            return 0;
        } else if (item1.getPrice() > item2.getPrice()){
            return 2;
        } else {
            return -2;
        }
    }
}
