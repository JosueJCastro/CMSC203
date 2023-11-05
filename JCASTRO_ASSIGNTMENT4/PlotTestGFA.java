import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class PlotTestGFA {
	private Plot plot1, plot5;

	@Before
	public void setUp() throws Exception {
		plot1 = new Plot(3, 4, 5, 6);
		plot5 = new Plot(7, 6, 5, 4);
		
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void testOverlaps() {
		assertTrue(plot1.overlaps(plot5)); 
	}
	
	@Test
	public void testToString() {
		assertEquals("7,6,5,4",plot5.toString());	
	}
	@Test
	public void testEncompasses()
	{
		assertTrue(plot1.encompasses(plot1));
	}
	@Test
	public void testgetX()
	{
		assertEquals(3,plot1.getX());
	}
	@Test
	public void getY() 
	{
		assertEquals(4,plot1.getY());
	}
	@Test
	public void getDepth() 
	{
		assertEquals(5,plot1.getWidth());
	}
	@Test
	public void getWidth() 
	{
		assertEquals(6,plot1.getDepth());
	}
	@Test
	public void testtoString()
	{
		assertEquals("3,4,5,6",plot1.toString());
	}
	
}

