/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description: A lot of classes tied together
 * Due: 12/5//2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Josue Castro
*/

public class Smoothie extends Beverage
{
	private int numOfFruits;
	private boolean addProtein;
	private final double FRUIT = 0.50;
	private final double PROTEIN = 1.5;
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		super(bevName, Type.SMOOTHIE, size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
		
	}
	public int getNumOfFruits() 
	{
		return numOfFruits;
	}
	public void setNumOfFruits(int numOfFruits)
	{
		this.numOfFruits = numOfFruits;
	}
	public boolean getAddProtein() 
	{
		return addProtein;
	}
	public void setAddProtein(boolean addProtein) 
	{
		this.addProtein = addProtein;
	}
	@Override
	public double calcPrice() 
	{
		double totalPrice;
		totalPrice = addSizePrice();
		if(addProtein)
		{
			totalPrice += PROTEIN;
		}
		totalPrice += (this.getNumOfFruits() * FRUIT);
		
		return totalPrice;
	}
	@Override
	public boolean equals(Object anotherBev)
	{
		// P for protein
		Beverage p = (Smoothie) anotherBev;
		if(super.equals(anotherBev) && numOfFruits == ((Smoothie) p).getNumOfFruits() && 
				addProtein == ((Smoothie) p).getAddProtein())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public String toString() 
	{	
		return "Name: " +  this.getBevName() + " ,"  +  "Size: " + this.getSize() + " ," + " Protein Added: " 
				+ this.getAddProtein() + " ," + "Number of Extra Fruit Added: " + this.getNumOfFruits() + " ," + "Price: " + this.calcPrice();
	}
	
}
