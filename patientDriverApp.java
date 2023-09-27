/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: (Give a brief description for each Class)
 * Due: 09/26/2023
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Josue Castro
*/

public class patientDriverApp
{
	public static void main(String[] args) 
	{
		// Here is the patient info that we will display at top later
	
		displayPatient();
		
		
		
		displayProcedure();
		
		
		System.out.println("Student Name: Josue Castro");
		System.out.println("MC#: M21122548");
		System.out.println("Due Date: 09/26/2023");
		
	}
	public static void displayPatient()
	{
		
		// Here is the patient info that we will display at top later
		Patient p1 = new Patient("Tuco", "Mantiquilla", "Salamanca", "1234 Cheese St", "Clarksburg", "SC", "345932",
				"980-456-9820", "Miguel", "202-347-9836");
		System.out.print(p1);
		
	}
	public static void displayProcedure()
	{
		double totalCharges;
		// We need three for each block and different procedures
		Procedure pro1 = new Procedure();
		Procedure pro2 = new Procedure("Laser Surgery", "08/02/2020");
		Procedure pro3 = new Procedure("Surgery", "03/01/2017", "Dr Kevin Trevin", 12345);
		
		pro1.setNameprocedure("Stitches");
		pro1.setDateProcedure("05/30/23");
		pro1.setPracProcedure("Chris Bliss");
		pro1.setChargeProcedure(4321.53);
		
		pro2.setPracProcedure("Hope Leclope");
		pro2.setChargeProcedure(34000);
		
		System.out.println(pro1 + "\n");
		System.out.println(pro2 + "\n");
		System.out.println(pro3 + "\n");
		// couldnt get calTotalcharges to display on its own so I pass parameters into double
		System.out.print("Total Charges: ");
		totalCharges = calculateTotalCharges(pro1, pro2, pro3);
		System.out.printf("%.2f", totalCharges);
		// Below displays my info
		System.out.print("\n");
		System.out.println();
	}
	// Gets all procedures double values and adds them up for a total
	public static double calculateTotalCharges(Procedure pro1, Procedure pro2, Procedure pro3)
	{
		return pro1.getChargeProcedure() + pro2.getChargeProcedure() + pro3.getChargeProcedure();
	}


	

}