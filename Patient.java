// Remember to use getter and setter 
public class Patient 
{
	// Below is meant for buildName
	private String firstName = "", middleName = "", lastName = "";
	// Below is meant for buildAdress
	private String streetAddress = "", city = "", state = "", zipCode = "";
	// Below is the phone number and the emergency numbers
	private String phoneNumber = "", emerName = "", emerNum = "";
	// All our methods are going to be listed below this comment
	
	//No Arg Constructor 
	public Patient()
	{
			
	}
	public Patient(String firstName,String middleName,String lastName)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	public Patient(String firstName, String middleName, String lastName,
				String streetAddress, String city, String state, String zipCode,
				String phoneNumber, String emerName, String emerNum)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		
		this.phoneNumber = phoneNumber;
		this.emerName = emerName;
		this.emerNum = emerNum;
		
	}
	
	public static String buildFullName(String firstName, String middleName,
									   String lastName )
	{
		
		return firstName + " " + middleName + " " + lastName;
	}
	
	public static String buildAddress(String streetAddress, String city, String state,
									  String zipCode)
	{
		return streetAddress + " " + city + " " +  state + " " + zipCode;
	}
	public static String buildEmergencyContact(String phoneNumber, String emerName, String emerNum)
	{
		return phoneNumber + " " + emerName + " " + emerNum;
	}
	// Start of accessors and mutators for each attribute 
	public void setfirstName(String fN)
	{
		this.firstName = fN;
	}
	public String getfirstName()
	{
		return firstName;
	}
	
	public void setMiddleName(String mN)
	{
		this.middleName = mN;
	}
	public String getMiddleName()
	{
		return middleName;
	}
	
	public void setLastName(String lN)
	{
		this.lastName = lN;
	}
	public String getLastName()
	{
		return lastName;
	}
	
	public void setStreetAddress(String sA)
	{
		this.streetAddress = sA;
	}
	public String getStreetAddress()
	{
		return streetAddress;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getCity()
	{
		return city;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	public String getState()
	{
		return state;
	}
	
	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}
	public String getZipCode()
	{
		return zipCode;
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void setEmerName(String emerName)
	{
		this.emerName = emerName;
	}
	public String getEmerName()
	{
		return emerName;
	}
	
	public void setEmerNum(String emerNum)
	{
		this.emerNum = emerNum;
	}
	public String getEmerNum()
	{
		return emerNum;
	}
	// end of acessors and mutators
	
	//below is the patient info
	public String toString()
	{
		return "Patient info: \n" +
			   " Name: " + firstName + " " + middleName + " " + lastName + "\n" +
			   " Address: " + streetAddress + " " + city + " " + state + " " + zipCode + "\n" +
			   " EmergencyContact: " + emerName + " " + emerNum + "\n\n";
	}
	
}
