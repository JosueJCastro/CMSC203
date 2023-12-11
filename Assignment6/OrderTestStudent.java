
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OrderTestStudent 
{
	Order one; Order two;
	@Before
	public void setUp() throws Exception 
	{
		one = new Order(12,Day.MONDAY, new Customer("Pete", 12));
		two = new Order(19, Day.SUNDAY, new Customer("George", 57));
	}

	@After
	public void tearDown() throws Exception 
	{
		one = two = null;
	}

	
	@Test
	public void testAddNewBeverage() 
	{
		one.addNewBeverage("Fruit Smoothie", Size.SMALL, 0, false);
		one.addNewBeverage("Alcohol", Size.SMALL);
		one.addNewBeverage("Smoothie", Size.SMALL, 0, false);
		assertEquals(6,one.calcOrderTotal(),0.01);
		
		
	}
	@Test
	public void testCalcOrderTotal() 
	{
		one.addNewBeverage("Fruit Smoothie", Size.SMALL, 0, false);
		assertTrue(2.0 == one.calcOrderTotal());
		
	}

	@Test
	public void testCompareTo() 
	{
		System.out.println("First Order Number:" + one.getOrderNo());
		System.out.println("Second Order Number: " + two.getOrderNo());
		assertFalse(one.compareTo(two) == 0);
	}
	@Test
	public void testFindNumOfBeveType() 
	{
		one.addNewBeverage("Fruit Smoothie", Size.SMALL, 0, false);
		one.addNewBeverage("Blueberry faygo", Size.MEDIUM, 0, false);
		assertEquals(2, one.findNumOfBeveType(Type.SMOOTHIE));
		
	}
	@Test
	public void testGenerateOrder() 
	{
		int orderNum = one.generateOrder();
		assertTrue(orderNum > 10000 && orderNum < 90000);
	}

	@Test
	public void testGetBeverage() 
	{
		one.addNewBeverage("Vodka", Size.MEDIUM);
		assertEquals(new Alcohol("Vodka", Size.MEDIUM, one.isWeekend()), one.getBeverage(0));
	}
	@Test
	public void testGetCustomer() 
	{
		assertEquals("George", two.getCustomer().getName());
		assertEquals(57, two.getCustomer().getAge());
	}

	@Test
	public void testGetDay() 
	{
		assertEquals(Day.MONDAY,one.getDay());
	}

	@Test
	public void testGetOrderDay() 
	{
		assertEquals(Day.SUNDAY,two.getDay());
	}

	@Test
	public void testGetOrderNo() 
	{
		assertFalse(one.getOrderNo() == two.getOrderNo());
	}
	@Test
	public void testGetOrderTime() 
	{
		Order three = new Order(10,Day.WEDNESDAY, new Customer("Joshua", 11));
		assertEquals(10,three.getOrderTime());
	}
	@Test
	public void testGetTotalItems() 
	{
		one.addNewBeverage("Rum", Size.SMALL);
		assertEquals(1, one.getTotalItems());
		
		two.addNewBeverage("Blueberry", Size.SMALL, false, false);
		two.addNewBeverage("Strawberry", Size.SMALL, false, false);
		
		assertEquals(2, two.getTotalItems());
	}
	@Test
	public void testIsWeekend() 
	{
		assertEquals(false, one.isWeekend());
		assertEquals(true, two.isWeekend());
	}
	@Test
	public void testToString()
	{
		 	one.addNewBeverage("Coffee", Size.MEDIUM, true, false);
	        one.addNewBeverage("Alcohol", Size.LARGE);
	        one.addNewBeverage("Smoothie", Size.SMALL, 2, true);

	        // Set the order time to 10
	        

	        // Set the expected string
	        String expected = "Order Number: " + one.getOrderNo() + "\n" + "Time: " + one.getOrderTime() 
			+ "\n" + "Day: " + one.getOrderDay() + "\n" + "Customer Name: " + one.getCustomer().getName() + "\n"
			+ "Age: " + one.getCustomer().getAge() + "\n Heres a list of Beverages " + one.getOrderList();

	        // Assert that the actual string matches the expected string
	        assertEquals(expected, one.toString());
	}
}