import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTest {

	Property propertyOne;
	
	@BeforeEach
	void setUp() throws Exception
	{
		propertyOne = new Property("Cheese St", "Bethesda", 5000.0, "Josue's Bank");
	}
	@AfterEach
	void tearDown() throws Exception
	{
		
	}

	@Test
	void testGetPropertyName() 
	{
		assertEquals("Cheese St",propertyOne.getPropertyName());
	}

	@Test
	void testGetCity()
	{
		assertEquals("Bethesda",propertyOne.getCity());
	}

	@Test
	void testGetOwner() 
	{
		assertEquals("Josue's Bank",propertyOne.getOwner());
	}
	

	@Test
	void testGetRentAmount() 
	{
		assertEquals(5000.0,propertyOne.getRentAmount());
	}

	@Test
	void testGetPlot() 
	{
		assertEquals(3,propertyOne.getPlot().getX());
		assertEquals(4,propertyOne.getPlot().getY());
		assertEquals(15,propertyOne.getPlot().getWidth());
		assertEquals(6,propertyOne.getPlot().getDepth());
	}

	@Test
	void testToString() 
	{
		assertEquals("Cheese st,Bethesda,Josue's Bank,5000.0",propertyOne.toString());
	}

}
