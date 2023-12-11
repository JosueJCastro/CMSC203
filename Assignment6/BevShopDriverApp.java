import java.util.Scanner;
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

public class BevShopDriverApp 
{

	public static void main(String[] args) {
		
		
		BevShop bevShop = new BevShop();
		 
		
		System.out.print("The current order in process can have at most ");
		System.out.print(BevShopInterface.MAX_ORDER_FOR_ALCOHOL);
		System.out.print(" alcoholic beverages.");
		
		System.out.print("\n");
		
		System.out.println("The minimum age to order alcohol drink is " + BevShopInterface.MIN_AGE_FOR_ALCOHOL);
		
		System.out.println("Start please a new order");
		
		bevShop.startNewOrder(9, Day.TUESDAY, "John", 23);
		
		
		
		System.out.println("Your Total Order for now is " + bevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println("Would you please enter your name " + bevShop.getCurrentOrder().getCustomer().getName());
		
		System.out.println("Would you please enter your age " + bevShop.getCurrentOrder().getCustomer().getAge());
		
		if(bevShop.getCurrentOrder().getCustomer().getAge() >= 21)
		{
			System.out.println("Your age is above " + bevShop.getCurrentOrder().getCustomer().getAge() + 
					" and you are eligible to order alochol");
		}
		else if (bevShop.getCurrentOrder().getCustomer().getAge() < 21)
		{
			System.out.println("Your age is below" + bevShop.getCurrentOrder().getCustomer().getAge() + 
					" and you are not eligible to order alochol");
		}
		
		System.out.println("The current order of drinks is " +  bevShop.getCurrentOrder().getTotalItems());
		
		
		
		System.out.println("Add alcohol drink");
		
		bevShop.getCurrentOrder().addNewBeverage("Something", Size.SMALL);
		
		System.out.println("Total on the Order:" + bevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println(bevShop.getCurrentOrder().isWeekend());
		
		System.out.println("Add second alcohol drink");
		
		bevShop.getCurrentOrder().addNewBeverage("Something", Size.LARGE);
		
		System.out.println("Total on the Order:" + bevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println(bevShop.getCurrentOrder().findNumOfBeveType(Type.ALCOHOL));
		
		System.out.println("Add third alcohol drink");
		
		bevShop.getCurrentOrder().addNewBeverage("Something", Size.SMALL);
		
		System.out.println("Total on the Order:" + bevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println(bevShop.getCurrentOrder().findNumOfBeveType(Type.ALCOHOL));
		
		System.out.println("Maximum alcohol drink for this order");
		
		System.out.println("Add a COFFEE to order");
		
		bevShop.getCurrentOrder().addNewBeverage("Something", Size.SMALL, true, true);
		
		System.out.println(bevShop.getCurrentOrder().findNumOfBeveType(Type.ALCOHOL));
		
		System.out.println("Total on the Order:" + bevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println("Total on the Order:" + bevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println("Start a new order");
		
		bevShop.startNewOrder(7, Day.SUNDAY, "Joe", 0);
		
		System.out.println("Total on the Order:" + bevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println("Add a SMOOTHIE to order");
		
		bevShop.getCurrentOrder().addNewBeverage("Something", Size.SMALL, 9, false);
		
		System.out.println("Total on the Order:" + bevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println("Add a COFFEE to order");
		
		bevShop.getCurrentOrder().addNewBeverage("Something", Size.SMALL, true, true);
		
		System.out.println("Total on the Order:" + bevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println(bevShop.getCurrentOrder().getCustomer().getAge());
		
		System.out.println("Age not appropriate for alcohol drink!!");
		
		System.out.println("Total on the Order:" + bevShop.getCurrentOrder().calcOrderTotal());
		
		bevShop.getCurrentOrder().addNewBeverage("Something", Size.SMALL, 6, true);
		
		System.out.println("Maximum number of fruits\n");
		
		System.out.println("Total on the Order:" + bevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println("Total amount for all orders:" + bevShop.totalMonthlySale()); 
		
		
		
	}
}