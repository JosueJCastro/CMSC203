/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: (Give a brief description for each Class)
 * Due: 11/04/2023
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Josue Castro
*/

public class Plot
{
	private int x;
	private int y;
	private int depth;
	private int width;
	
	public Plot()
	{
		depth = 1;
		width = 1;
	}
	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	public Plot(Plot otherPlot)
	{
		this.x = otherPlot.x;
		this.y = otherPlot.y;
		this.width = otherPlot.width;
		this.depth = otherPlot.depth;
	}
	public Boolean encompasses(Plot plot)
	{
		
		if(this.y <= 10 || getY() <= 10 || this.x <= 10 || getX() <=10
				|| this.y >= 0 || getY() >= 0 || this.x >= 0 || getX() >= 0)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	public Boolean overlaps(Plot plot)
	{
		// Adds the width to x to the top right coordinate
		int fullX = this.x + width;
		//Adds the depth to get bottom left coordinate
		int fullY = this.y + depth;
		// Adds width to the x at the bottom left
		int x2 = plot.getX();
		int y2 = plot.getY();
		int x2Full = plot.getX() + plot.getWidth();
		int y2Full = plot.getY() + getDepth();
		
		
		// First two expressions compare orignal point to first point being passed through 
		if(this.x >= x2 || this.x <= x2Full || fullY >= y2 || this.y <= y2Full)
			return true;
		else
		{
		return false;
		}
	}
	public int getX()
	{
		return x;
	}
	public void setX(int x) 
	{
		this.x = x;
	}
	public int getY() 
	{
		return y;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public int getDepth() 
	{
		return depth;
	}
	public void setDepth(int depth)
	{
		this.depth = depth;
	}
	public int getWidth() 
	{
		return width;
	}
	public void setWidth(int width) 
	{
		this.width = width;
	}
	public String toString()
	{
		return getX() + "," + getY() + "," + getWidth() + "," + getDepth();
	}
	
}
