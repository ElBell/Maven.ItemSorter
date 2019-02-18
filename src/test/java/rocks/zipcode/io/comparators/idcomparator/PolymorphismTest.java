package rocks.zipcode.io.comparators.idcomparator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.comparators.Comparator;
import rocks.zipcode.io.comparators.IdComparator;
import rocks.zipcode.io.comparators.NameComparator;


/**
 * @author leon on 30/01/2019.
 */
public class PolymorphismTest {
    @Test
    public void test1() {
        IdComparator nameComparator = new IdComparator();
        Assert.assertTrue(nameComparator instanceof Comparator);
    }
}
