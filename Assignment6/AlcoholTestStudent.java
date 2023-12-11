import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class AlcoholTestStudent 
{
	 Alcohol one;
	 Alcohol two;

    @Before
    public void setUp() throws Exception 
    {
	     one = new Alcohol("Whiskey", Size.MEDIUM, true);
	     two = new Alcohol("Vodka", Size.LARGE, false);
    }

	@After
    public void tearDown() throws Exception 
	{
		one = null; 
	}
	@Test
    public void testCalcPrice()
	{
        Alcohol a1 = new Alcohol("Beer", Size.MEDIUM, true);
        assertEquals(3.6, a1.calcPrice(), 0.01);
        
        Alcohol a2 = new Alcohol("Wine", Size.LARGE, false);
        assertEquals(4.0, a2.calcPrice(), 0.01);
    }

    @Test
    public void testEquals() {
        Alcohol alcohol1 = new Alcohol("Whiskey", Size.SMALL, true);
        Alcohol alcohol2 = new Alcohol("Whiskey", Size.SMALL, true);

        assertTrue(alcohol1.equals(alcohol2));
    }

    @Test
    public void testNotEquals() {
        Alcohol alcohol1 = new Alcohol("Vodka", Size.LARGE, true);
        Alcohol alcohol2 = new Alcohol("Rum", Size.LARGE, false);

        assertFalse(alcohol1.equals(alcohol2));
    }

    @Test
    public void testToString()
    {
        String str = "Name: Whiskey ,Size: MEDIUM , Offered During Weekend?: 0.5 ,Price: 3.0";
        assertEquals(str, str.toString());
    }
}