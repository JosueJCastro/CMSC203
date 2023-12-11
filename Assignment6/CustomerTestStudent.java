import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomerTestStudent {
	Customer one; Customer two;
	
	@Before
	public void setUp() throws Exception {
		one = new Customer("John", 30);
		two = new Customer("David", 17);
	}

	@After
	public void tearDown() throws Exception {
		one = two = null;
	}

	@Test
	public void testCustomer() {
		Customer three = new Customer(one);
		assertTrue(one.getAge() == three.getAge());
		assertTrue(one.getName().equals(three.getName()));
	}

	@Test
	public void testGetAge() {
		assertTrue(30 == one.getAge());
		assertTrue(17 == two.getAge());
	}

	@Test
	public void testGetName() {
		assertTrue(one.getName().equals("John"));
		assertTrue(two.getName().equals("David"));
	}

	@Test
	public void testSetAge() {
		one.setAge(18);
		two.setAge(18);
		assertEquals(one.getAge(), two.getAge());
	}

	@Test
	public void testSetName() {
		one.setName("David");
		assertEquals(one.getName(), two.getName());
	}

	@Test
	public void testToString() {
		assertFalse(one.toString().equals(two.toString()));
		String str = "Name: David Age: 17";
		assertEquals(str, two.toString());
	}

}