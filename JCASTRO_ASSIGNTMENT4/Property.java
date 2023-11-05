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

public class Property 
{
	private String propertyName;
	private String city;
	private String owner;
	private double rentAmount;
	private Plot plot;
	
	public Property()
	{
		propertyName = "";
		city = "";
		owner = "";
		rentAmount = 0;
		Plot plot = new Plot();
	}
	public Property(String pName, String city, double rentAmount, String owner)
	{
		this.propertyName = pName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		Plot plot = new Plot();
	}
	public Property(String pName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.propertyName = pName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		Plot plot = new Plot(x,y,width,depth);
	}
	public Property(Property otherProperty)
	{
		// These use the getters from the  property class
		this.plot = new Plot(otherProperty.getPlot());
		this.propertyName = otherProperty.getPropertyName();
		this.city = otherProperty.getCity();
		this.rentAmount = otherProperty.getRentAmount();
		this.owner = otherProperty.getOwner();
		
	}
	public String getPropertyName() 
	{
		return propertyName;
	}
	public String getCity() 
	{
		return city;
	}
	public String getOwner()
	{
		return owner;
	}
	public double getRentAmount()
	{
		return rentAmount;
	}
	public Plot getPlot()
	{
		return plot;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	public void setPlot(Plot plot) {
		this.plot = plot;
	}
	public String toString()
	{
		return propertyName + "," + city + "," + owner + "," + rentAmount;
	}
}
