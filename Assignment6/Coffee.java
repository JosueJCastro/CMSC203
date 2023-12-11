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

public class Coffee extends Beverage
{
	private boolean extraShot;
	private boolean extraSyrup;
	
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) 
	{
		super(bevName, Type.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	
	public boolean getExtraShot() 
	{
		return extraShot;
	}

	public boolean getExtraSyrup() 
	{
		return extraSyrup;
	}
	@Override
	public double calcPrice()
	{
		/*Our holder will be used to get the size + base price so now we only consider addtionals
		 * Because the only thing the beverage class does is charge a base and additonal for size
		 */
		// May cause an error so comeback to fix if needed
		double totalPrice;
		totalPrice = addSizePrice();
		
		

	    if (extraShot) {
	        totalPrice += 0.50;
	    }  
	    if (extraSyrup) 
	    {
	        totalPrice += 0.50;
	    }

	    return totalPrice;
		
	}
	@Override
	public boolean equals(Object anotherBev)
	{
		
		if(super.equals(anotherBev) && extraShot == ((Coffee)anotherBev).getExtraShot() && 
				extraSyrup == ((Coffee) anotherBev).getExtraSyrup())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		return  "Name: " +  this.getBevName() + " ,"  +  "Size: " + this.getSize() + " ," + 
					"Has Extra Shot?: " + this.getExtraShot() + " ," + "Has Extra Syrup?: " 
					+ this.getExtraSyrup() + " ," + "Price: " + this.calcPrice();
	}

}
