
public class Alcohol extends Beverage
{
	private boolean isWeekend;
	private final double WEEKEND = 0.60;
	public Alcohol(String bevName, Size size, boolean isWeekend) 
	{
		super(bevName, Type.ALCOHOL, size);
		this.isWeekend = isWeekend;
	}
	public boolean isWeekend() 
	{
		return isWeekend;
	}
	public void setWeekend(boolean isWeekend) 
	{
		this.isWeekend = isWeekend;
	}
	@Override
	public double calcPrice()
	{
		double totalPrice = addSizePrice();
		if(isWeekend()) 
		{
			totalPrice += WEEKEND;
		}
		return totalPrice;
		
	}
	@Override
	public boolean equals(Object anotherBev)
	{
		
		if(super.equals(anotherBev) && this.isWeekend() == ((Alcohol)anotherBev).isWeekend())
		{
			return true;
		}
		
		return false;

	}
	
	@Override
	public String toString() 
	{
		
		return "Name: " +  getBevName() + " ," +  "Size: " + getSize() 
		+ " ," + " Offered During Weekend?: " + WEEKEND + " ," + "Price: " + calcPrice();
	}
	
}
