/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Calc a arrays lowest,highest, index
 * Due: 11/18/2023
 * Platform/compiler: eclpise
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Josue CAstro
*/
public class HolidayBonus
{
	final static double HIGHEST_BONUS = 5000;
	final static double OTHER_BONUS = 2000;
	final static double LOWEST_BONUS = 1000;
	
	public HolidayBonus()
	{
		
	}
	public static double[] calculateHolidayBonus(double[][] data) 
	{
		// use methods from the other class
		double[] holiBonuses = new double[data.length];
			for(int row = 0; row < data.length; row++)
			{
				double total = 0;
				for(int col = 0; col < data[row].length; col++) 
				{
					if(TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, col) == row)
					{
						total += HIGHEST_BONUS;
					}
					else if(TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col) == row)
					{
						total += LOWEST_BONUS;
					}
					else
					{
						total += OTHER_BONUS;
					}
				}
				holiBonuses[row] = total;
			}
			return holiBonuses;
	}
		public static double calculateTotalHolidayBonus(double[][] data) 
		{
			// very samething as above
			double holidayBonus = 0;
			for(int row = 0; row < data.length; row++) 
			{

				for(int col = 0; col < data[row].length; col++) 
				{

					if(row == TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, col) )
					{
						holidayBonus += HIGHEST_BONUS;
					}
					else if(row ==TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col) )
					{
						holidayBonus += LOWEST_BONUS;
					}
					else
					{
						holidayBonus += OTHER_BONUS;
					}
				}
			}

			return holidayBonus;
		}
}
