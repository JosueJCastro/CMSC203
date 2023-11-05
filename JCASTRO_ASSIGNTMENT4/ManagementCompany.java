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

public class ManagementCompany extends Plot
{
	private static final int MAX_PROPERTY = 5;
	private static final int MGMT_WIDTH = 10;
	private static final int MGMT_DEPTH = 10;
	
	private String taxID;
	private String name;
	private double mgmFee;

	Property[] properties = new Property[MAX_PROPERTY];
	private Plot plot;
	private int numberOfProperties = 0;
	
	public ManagementCompany()
	{
		this.name = "";
		this.taxID = "";
		this.mgmFee = 0;
		this.plot = new Plot();
		this.properties = new Property[MAX_PROPERTY];
		
	}
	public ManagementCompany(String name,String taxID, double mgmFee)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		plot = new Plot(0,0,MGMT_WIDTH,MGMT_DEPTH);
	}
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		
		this.plot = new Plot(x, y, MGMT_WIDTH, MGMT_DEPTH);
	}
	public ManagementCompany(ManagementCompany otherCompany)
	{
		this.name = otherCompany.getName();
		this.taxID = otherCompany.getTaxID();
		this.mgmFee = otherCompany.getMgmFeePer();
		
	}
	
	public double getMgmFeePer()
	{
		return mgmFee;
	}
	public String getName()
	{
		return name;
	}
	public Plot getPlot()
	{
		return this.plot;
	}
	public Property[] getProperty()
	{
		return properties;
	}
	public String getTaxID()
	{
		return taxID;
	}
	// END OF GETTERS ^^^
	
	// Beggining of all three ADD PROPERTY
	public int addProperty(String name, String city, double rent,String owner)
	{
		return addProperty(new Property(name,city,rent, owner));
	}
	// Was unable to have addProperty name for method below SOLVED - have diff parameters
	public int addProperty(String name, String city, double rent,String owner, int x, int y, int width, int depth)
	{
		return addProperty(new Property(name,city,rent, owner,x,y,width,depth));
	}
	public int addProperty(Property property) {
	    Property hold;

	    if (numberOfProperties >= 5)
	    {
	        return -1; // If the array is full
	    } 
	    else if (property == null) 
	    {
	        return -2; // If property is null, return -2
	    } 
	    else if (!this.plot.encompasses(property.getPlot()))
	    {
	        return -3; // If the plot does not encompass the property's plot, return -3
	    }
	    for(int i = 0; i < numberOfProperties;i++)
	    {
	    	if(property.getPlot().overlaps(properties[i].getPlot())==true)
	    	{
	    		return -4;
	    	}
	    }

	    hold = new Property(property);
	    properties[numberOfProperties] = hold;
	    numberOfProperties++;
	    return numberOfProperties - 1;
	}

	// END OF ADD PROPERTY
	public void removeLastProperty()
	{
		numberOfProperties = 0;
		int counter = 0;
		for (int i = 0;i < 5;i++)
		{
			if(properties[i].equals(null))
			{
				counter = i;
			}
		}
		properties[counter - 1].setCity(null);
		properties[counter - 1].setRentAmount(0);
		properties[counter - 1].setOwner(null);
		properties[counter - 1].setPropertyName(null);
		
		// Note to self: Try to use selection sort and rearrange and priotize removing empty arrays first 		
	}
	public boolean isPropertiesFull()
	{
		int counter = 0;
		for(int i = 0; i < MAX_PROPERTY; i++)
		{
			if(!(properties[i] == null))
			{
				counter++;
			}
		}
		
		if(counter == 5)
		{
			return true;
		}
		else
			return false;
		
	}
	public int getPropertiesCount()
	{
		int count = 0;
		for(int i = 0; i < properties.length; i++) {
			if(properties[i] != null) {
				count++;
			}
		}
		return count;
	}
	public boolean isMangementFeeValid()
	{
		if(mgmFee >= 0 && mgmFee <= 100)
		{
			return true;
		}
		else 
		 return false;
	}
	public double getTotalRent()
	{
		double totalRent = 0;
        for (int i = 0; i < numberOfProperties; i++) {
            totalRent += properties[i].getRentAmount();
        }
        return totalRent;
	}
	public Property getHighestRentProperty()
	{
		// with a little modifications this was based off chapter 7 useful
		Property highest = new Property();
		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i].getRentAmount() > highest.getRentAmount())
				highest = properties[i];
		}
		return highest;
	}
	public String toString()
	{
		String returSumStr = "";
		
			for(int i = 0; i < numberOfProperties; i++)
				{
						returSumStr += "," + properties[i].getPropertyName() + "," + properties[i].getCity() + "," +
								properties[i].getOwner() + "," + properties[i].getRentAmount();
				}
			return  "List of the properties for " + getName() + ", taxID: " + getTaxID() + "\n"
					+ "______________________________________________________\n"
					+  returSumStr
					+ "______________________________________________________\n"
					+"\n"
					+ " total management Fee: " + (getTotalRent()*mgmFee)/100;
	}
	

}
