import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class GradeBookTest 
{
	GradeBook g1;
	GradeBook g2;
	@BeforeEach
	void setUp() throws Exception 
	{
        g1 = new GradeBook(5);
		
		g1.addScore(50.0);
		g1.addScore(60.0);
		
		
		g2 = new GradeBook(5);
		g2.addScore(70.0);
		g2.addScore(80.0);
		g2.addScore(90.0);
		
		
	}

	@AfterEach
	void tearDown() throws Exception
	{
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore()
	{
		assertTrue(g1.toString().equals("50.0 60.0 0.0 0.0 0.0 "));
		assertEquals(2, g1.getScoreSize());
		
		assertTrue(g2.toString().equals("70.0 80.0 90.0 0.0 0.0 "));
		assertEquals(3, g2.getScoreSize());
		
	}

	@Test
	void testSum() 
	{
		assertEquals(110.0, g1.sum());
		assertEquals(240.0, g2.sum());
		
	}

	@Test
	void testMinimum() 
	{
		assertEquals(50.0, g1.minimum(), g2.minimum());
	}

	@Test
	void testFinalScore() 
	{
		assertEquals(100.0, g1.finalScore(),g2.finalScore());
	}
}
