/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Calc a arrays lowest,highest, index
 * Due: 11/18/2023
 * Platform/compiler:eclpise
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Josue Castro
*/
import java.io.*;
import java.util.Scanner;
public final class TwoDimRaggedArrayUtility extends Object
{
	public static double[][] readFile(File fileName)throws FileNotFoundException
	{
		Scanner scanner = new Scanner(fileName);
		String [][] temp = new String[10][10];
		int stringRow = 0;
	    int rowCount = 0;
	     while (scanner.hasNextLine()) 
	     {
	    	 String s = scanner.nextLine();
	    	 temp[stringRow] = s.split(" ");
	    	 if (temp[stringRow][0] != null) 
	    	 {
	            rowCount++;
	    	 }
	           stringRow++;
	      }
	        double [][] data = new double[rowCount][];
	        for (int row = 0; row < rowCount; row++)
	        {
	            data[row] = new double[temp[row].length];
	            for (int col = 0; col < temp[row].length; col++) 
	            {
	                data[row][col] = Double.parseDouble(temp[row][col]);
	            }
	      }
	    return data;
		
	}
	
	public static void writeToFile(double[][] data,File fileName)throws FileNotFoundException
	{
		PrintWriter fileIn = new PrintWriter(fileName);
		for(int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				fileIn.print(data[row][col] + " ");
			}
			fileIn.println();
		}
		fileIn.close();
	}
	public static double getTotal(double[][] data)
	{
		double total = 0;

		for(int row = 0; row < data.length;row++)
		{
		
			for(int col = 0; col < data[row].length; col++)
			 total += data[row][col];
		}
		return total;
	}
	public static double getAverage(double[][] data)
	{
		// Was thinking of using a while loop seperatly but remembered just use a counter to keep track of number of elements
		double total = 0;
		double average = 0;
		double counter = 0;
		for(int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				total += data[row][col];
				counter++;
			}
		}
		average = total / counter;
		return average;
	}
	public static double getRowTotal(double[][] data, int row)
	{
		
		double total = 0;
		// sRow is the one that goes through every single element in a given row
		for(int sRow = 0; sRow < data[row].length;sRow++)
		{
			total += data[row][sRow];
		}
		return total;
	}
	public static double getColumnTotal(double[][] data,int col)
	{
		double total = 0;
		for(int i = 0; i < data.length; i++)
		{
			if(col >= data[i].length)
			{
				continue;
			}
			total += data[i][col];
		}
		return total;
	}
	public static double getHighestInRow(double[][] data, int row)
	{
		// Remember from chapter 7 useful search algoritms 
		double highestInRow = data[row][0];
		for(int i = 0; i < data[row].length; i++)
		{
			if(data[row][i] > highestInRow)
			{
				highestInRow = data[row][i];
			}
		}
		return highestInRow;
	}
	public static int getHighestInRowIndex(double[][] data,	 int row)
	{
		int highestInIndex = 0;
		double highestInRow = 0;
		
		boolean found = false;
		int counter = 0;
		for(int i = 0; i < data[row].length; i++)
		{
			if(data[row][i] > highestInRow)
			{
				highestInRow = data[row][i];
			}
			
		}
		while(!found && counter < data[row].length)
		{
			if(data[row][counter] == highestInRow)
			{
				found = true;
				highestInIndex = counter;
				
			}
				counter++;
		
		}
		return highestInIndex;
	}
	public static double getLowestInRow(double[][] data, int row)
	{
		
		double lowestInRow = data[row][0];
		for(int i = 0; i < data[row].length; i++)
		{
			if(data[row][i] < lowestInRow)
			{
				lowestInRow = data[row][i];
			}
		}
		return lowestInRow;
		
	}
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		boolean found = false;
		int counter = 0;
		
		int lowestInRowIndex = 0;
		double lowestInRow = data[row][0];
		
		for(int i = 0; i < data[row].length; i++)
		{
			if(data[row][i] < lowestInRow)
			{
				lowestInRow = data[row][i];
			}
		}
		while(!found && counter < data[row].length)
		{
			if(data[row][counter] == lowestInRow)
			{
				found = true;
				lowestInRowIndex = counter;
				
			}
				counter++;
		
		}
		
		return lowestInRowIndex;
		
	}
	public static double getHighestInColumn(double[][] data, int col)
	{
		
		double highestInCol = 0;
		for(int i = 0; i < data.length; i++)
		{
			if(col >= data[i].length)
			{
				continue;
			}
			if(data[i][col] > highestInCol)
			{
				highestInCol = data[i][col];
			}
		}
		return highestInCol;
		
	}
	public static int getHighestInColumnIndex(double[][] data,int col)
	{
		int highestIndex = 0;
		
		for(int row = 0; row < data.length; row++) {
			
			System.out.println(highestIndex + " " + row);
			
			if(col < data[row].length && data[row][col] > data[highestIndex][col])
				
				highestIndex = row;
			
		}
		
		return highestIndex;
		
		}
		
		
	public static double getLowestInColumn(double[][] data,int col)
	{
		double total = 0;
		double lowestInCol = data[0][col];
		
		
		for(int i = 0; i < data.length; i++)
		{
			if(col >= data[i].length)
			{
				continue;
			}
			if(data[i][col] < lowestInCol)
			{
				lowestInCol = data[i][col];
			}
		}
		
		return lowestInCol;
		
	}
	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		int lowestIndex = 0;
		
		for(int row = 0; row < data.length; row++) {
			
			if(col < data[row].length && data[row][col] < data[lowestIndex][col])
				
				lowestIndex = row;
			
		}
		
		return lowestIndex;
	}
	public static double getHighestInArray(double[][] data)
	{
		double highest = data[0][0];
		
		for(int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				if(data[row][col] > highest)
				{
					highest = data[row][col];
				}
			}
		}
		return highest;
	}
	public static double getLowestInArray(double[][] data)
	{
		double lowest = data[0][0];
		
		for(int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				if(data[row][col] < lowest)
				{
					lowest = data[row][col];
				}
			}
		}
		return lowest;
		
	}
	
}
