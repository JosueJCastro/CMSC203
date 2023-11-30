/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Calc a arrays lowest,highest, index
 * Due: 11/18/2023
 * Platform/compiler:eclpise
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Josue CAstro
*/

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoDimRaggedArrayUtilityTest {

	// The following information below will be used in order to test read file and write file methods
	double[][] data = {{5,7,9},{2,6},{5,8,3}};
	File testFile = new File("testFile.txt");
	
	@BeforeEach
	void setUp() throws Exception 
	{
		
       
	}
	@AfterEach
	void tearDown() throws Exception 
	{
		 
	}
	 @Test
	 public void testReadFile() throws FileNotFoundException 
	 {
	        // Prepare test data
	        

	        // Write test data to the file
	        TwoDimRaggedArrayUtility.writeToFile(data, testFile);

	        // Call the method to be tested
	        double[][] actualData = TwoDimRaggedArrayUtility.readFile(testFile);

	        // Compare expected and actual data
	        assertArrayEquals("Test data and data read from file should be equal", data, actualData);
	 }
	@Test
	public void testWriteToFile() throws FileNotFoundException, IOException
	{
		try 
		{
			File tempFile = File.createTempFile("testWriteToFile", ".txt");
			
			TwoDimRaggedArrayUtility.writeToFile(data, tempFile);
			
			double[][] result = TwoDimRaggedArrayUtility.readFile(tempFile);
			
			assertArrayEquals(data, result);
		} catch(Exception e) {
				fail("Exception: " + e.getMessage());
		}
		
    }
	@Test
	void testGetTotal() 
	{
		assertEquals(TwoDimRaggedArrayUtility.getTotal(data), 45.0);
	}

	@Test
	void testGetAverage() 
	{
		assertEquals(TwoDimRaggedArrayUtility.getAverage(data),5.625);
	}

	@Test
	void testGetRowTotal()
	{
		assertEquals(TwoDimRaggedArrayUtility.getRowTotal(data,0),21.0);
	}

	@Test
	void testGetColumnTotal() 
	{
		assertEquals(TwoDimRaggedArrayUtility.getColumnTotal(data,0),12.0);
	}

	@Test
	void testGetHighestInRow() 
	{
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRow(data,0),9.0);
	}

	@Test
	void testGetHighestInRowIndex() 
	{
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRowIndex(data,0),2);
	}

	@Test
	void testGetLowestInRow() 
	{
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRow(data,0),5.0);
	}

	@Test
	void testGetLowestInRowIndex() 
	{
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRowIndex(data,0),0);
	}

	@Test
	void testGetHighestInColumn()
	{
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumn(data,0),5.0);
	}

	@Test
	void testGetHighestInColumnIndex()
	{
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumnIndex(data,0),0);
	}

	@Test
	void testGetLowestInColumn() 
	{
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumn(data,0),2.0);
	}

	@Test
	void testGetLowestInColumnIndex() 
	{
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumnIndex(data,0),1);
	}

	@Test
	void testGetHighestInArray()
	{
		assertEquals(TwoDimRaggedArrayUtility.getHighestInArray(data),9.0);
	}

	@Test
	void testGetLowestInArray() 
	{
		assertEquals(TwoDimRaggedArrayUtility.getLowestInArray(data),2.0);
	}

}
