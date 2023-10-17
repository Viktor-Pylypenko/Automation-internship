package junk;

import junit.framework.ComparisonCompactor;
import junit.framework.TestCase;

public class ComparisonCompactorTest extends TestCase {

    public void testMessage() {
        String failure = new ComparisonCompactor(2, "bartu", "berti").compact("Error");
        assertEquals("Error expected:<[bart]> but was:<[bert]>", failure);
    }

}
