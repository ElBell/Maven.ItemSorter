package rocks.zipcode.io.comparators.namecomparator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.comparators.NameComparator;
import rocks.zipcode.io.comparators.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PolymorphismTest {
    @Test
    public void test1() {
        NameComparator nameComparator = new NameComparator();
        Assert.assertTrue(nameComparator instanceof Comparator);
    }
}
