package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item>{
    public Integer compare(Item item1, Item item2) {
        if (item1.getId() == item2.getId()) {
            return 0;
        } else if (item1.getId() > item2.getId()){
            return 2;
        } else {
            return -2;
        }
    }
}
