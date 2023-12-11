import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoffeeTestStudent {
	Coffee one; Coffee two;
	@Before
	public void setUp() throws Exception {
		one = new Coffee("Espresso", Size.SMALL, false, false);
		two = new Coffee("Starbuck Coffee", Size.LARGE, true, true);
	}

	@After
	public void tearDown() throws Exception {
		one = two = null;
	}

	@Test
	public void testCoffee() {
		Coffee three = new Coffee("Espresso", Size.SMALL, false, false);
		assertTrue(one.equals(three));
	}
	@Test
	public void testCalPrice() {
		
		assertEquals(2.0, one.calcPrice(), 0.01);
        assertEquals(5.0, two.calcPrice(), 0.01);
        
		 
	}
	@Test
	public void testEquals() {
		Coffee four = new Coffee("Starbuck Coffee", Size.LARGE, true, true);
		assertTrue(two.equals(four));
	}

	@Test
	public void testGetExtraShot() {
		assertTrue(false == one.getExtraShot());
		assertTrue(true == two.getExtraShot());
	}

	@Test
	public void testGetExtraSyrup() {
		assertTrue(false == one.getExtraSyrup());
		assertTrue(true == two.getExtraSyrup());
	}

	@Test
	public void testToString() 
	{
		String str = "Name: " + "Espresso" + " ,"  +  "Size: " + "SMALL" + " ," + 
				"Has Extra Shot?: " + "false" + " ," + "Has Extra Syrup?: " 
				+ "false" + " ," + "Price: " + "2.0";
		assertEquals(str,one.toString());
	}
}