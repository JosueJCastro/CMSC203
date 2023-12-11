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

public abstract class Beverage 
{
	private String name;
	private Type type;
	private Size size;
	final double BASE_PRICE =2.0;
	final double SIZE_PRICE = 1.0;
	
	public Beverage(String bevName, Type t, Size s)
	{
		name = bevName;
		type = t;
		size = s;
		
	}
	
	 public abstract double calcPrice();
	 
	 public double addSizePrice()
	 {
		 
		 if(size.equals(Size.MEDIUM))
		 {
			 return BASE_PRICE + SIZE_PRICE;
		 }
		 else if(size.equals(Size.LARGE))
		 {
			 return BASE_PRICE + (SIZE_PRICE + SIZE_PRICE);
		 }
		 else
		 {
			 return BASE_PRICE;
		 }
		  
	 }
	
	 public void setBevName(String bevName) 
	 {
         name = bevName;
	 }
	 public void setType(Type t) 
	 {
         type = t;
	 }
	 public void setSize(Size s) 
	 {
         size = s;
	 }
	 
	 public String getBevName() 
	 {
         return name;
	 }
	 public Type getType() 
	 {
         return type;
	 }
	 public Size getSize()
	 {
         return size;
	 }
	 public double getBasePrice() 
	 {
         return BASE_PRICE;
	 }
	 public double getSizePrice()
	 {
		 return SIZE_PRICE;
	 }
	 
	@Override
	public boolean equals(Object anotherBev)
	{
		Beverage b = (Beverage) anotherBev;
		if(name.equals(b.getBevName()) && type.equals(b.getType()) && size.equals(b.getSize()))
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
		return name + ", " + size;
	 }
}
