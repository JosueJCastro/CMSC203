
public class Procedure 
{
	private String nameProcedure, dateProcedure, pracProcedure;
	private double chargeProcedure;
	//no arg constructor
	public Procedure()
	{
		
	}
	// constructor 
	public Procedure(String nameProcedure, String dateProcedure)
	{
		this.nameProcedure = nameProcedure;
		this.dateProcedure = dateProcedure;
	}
	//constructor that assigns to all attributes
	public Procedure(String nameProcedure, String dateProcedure, String pracProcedure,
			 double chargeProcedure)
	{
		this.nameProcedure = nameProcedure;
		this.dateProcedure = dateProcedure;
		this.pracProcedure = pracProcedure;
		this.chargeProcedure = chargeProcedure;
	}
	// Beginning of mutator and accessor
	public void setNameprocedure(String nameProcedure)
	{
		this.nameProcedure = nameProcedure;
	}
	public String getNameProcedure()
	{
		return nameProcedure;
	}
	
	public void setDateProcedure(String dateProcedure)
	{
		this.dateProcedure = dateProcedure;
	}
	public String getDateProcedure()
	{
		return dateProcedure;
	}
	
	public void setPracProcedure(String pracProcedure)
	{
		this.pracProcedure = pracProcedure;
	}
	public String getPracProcedure()
	{
		return pracProcedure;
	}
	
	public void setChargeProcedure(double chargeProcedure)
	{
		this.chargeProcedure = chargeProcedure;
	}
	public double getChargeProcedure()
	{
		return chargeProcedure;
	}
	// ^^ end of accesors and mutators
	
	// forward slash t gives us a tab and n gives us a new line
	public String toString()
	{
		return "\tProcedure: " + nameProcedure + " " + "\n" +
			   "\tProcedureDate=" + dateProcedure + "\n" + 
			   "\tPracticioner=" + pracProcedure + "\n" + 
			   "\tCharge=" + chargeProcedure;
	}
}
