import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SmoothieTestStudent {

    Smoothie one;
    Smoothie two;

    @Before
    public void setUp() throws Exception {
        one = new Smoothie("Mango Smoothie", Size.SMALL, 1, false);
        two = new Smoothie("Green Juice", Size.LARGE, 5, true);
    }

    @After
    public void tearDown() throws Exception {
        one = two = null;
    }

    @Test
    public void testSmoothie() {
        // Add any relevant assertions for the constructor if needed
    }

    @Test
    public void testCalcPrice() {
        assertEquals(2.5, one.calcPrice(), 0.01);
        assertEquals(8.0, two.calcPrice(), 0.01);
    }

    @Test
    public void testEquals() {
        // Add assertions to test the equals method
        assertFalse(one.equals(two)); // Example assertion, adjust based on your implementation
    }

    @Test
    public void testGetAddProtein() {
        assertFalse(one.getAddProtein());
        assertTrue(two.getAddProtein());
    }

    @Test
    public void testGetNumOfFruits() {
        assertEquals(1, one.getNumOfFruits());
        assertEquals(5, two.getNumOfFruits());
    }

	@Test
    public void testToString() {
        String expected = "Name: Tropical Delight ,Size: MEDIUM , Protein Added: true ,Number of Extra Fruit Added: 3 ,Price: 0.0";
        assertEquals(expected, expected.toString());
    }
	
}