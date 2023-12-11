import java.util.ArrayList;
public class Order implements OrderInterface, Comparable<Order>
{
	private int orderNumber;
	private int orderTime;
	private Day orderDay;
	private Customer cust;
	private ArrayList<Beverage> orderList;

	public Order(int orderTime, Day orderDay, Customer cust) 
	{
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.cust = cust;
		orderList = new ArrayList<Beverage>();
		orderNumber = this.generateOrder();
	}
	
	public boolean isWeekend()
	{
		if(orderDay.equals(Day.SATURDAY) || orderDay.equals(Day.SUNDAY)) 
		{
			return true;
		}
		return false;
	}

	
	public Beverage getBeverage(int itemNo) 
	{
		return orderList.get(itemNo);
	}

	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		orderList.add(new Coffee(bevName, size, extraShot, extraSyrup));
	}

	
	public void addNewBeverage(String bevName, Size size) 
	{
		orderList.add(new Alcohol(bevName, size, this.isWeekend()));
	}

	
	public void  addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) 
	{
		orderList.add( new Smoothie(bevName, size, numOfFruits, addProtein));
	}

	
	public double calcOrderTotal()
	{
		double total = 0; 
		for(int i = 0; i < orderList.size(); i++) 
		{
			total += getBeverage(i).calcPrice();
		}
		return total;
	}
	
	 
	public int findNumOfBeveType(Type type) 
	{
		int counter = 0;
		for(int i = 0; i < orderList.size(); i++) 
		{
			if(getBeverage(i).getType().equals(type))
			{
				counter++;
			}

		}
		return counter;
	}

	public int compareTo(Order anotherOrder) 
	{
		if(this.getOrderNo() > anotherOrder.getOrderNo()) 
		{
			return 1;
		} else if(this.getOrderNo() < anotherOrder.getOrderNo())
		{
			return -1;
		} else 
		{
			return 0;
		}
	} 

	public int generateOrder()
	{
		int orderNumber = (int)((Math.random() * 90000)+ 1);
		return orderNumber;
 	}

	public Customer getCustomer() 
	{
		return new Customer(cust);
	}

	public Day getDay() 
	{
		return orderDay;
	}

	public Day getOrderDay() 
	{
		return orderDay;
	}

	public int getOrderNo() 
	{
		return orderNumber;
	}

	public int getOrderTime() 
	{
		return orderTime;
	}

	public int getTotalItems() 
	{
		return orderList.size();
	}
	
	public String toString() 
	{
		return  "Order Number: " + this.getOrderNo() + "\n" + "Time: " + getOrderTime() 
		+ "\n" + "Day: " + getOrderDay() + "\n" + "Customer Name: " + getCustomer().getName() + "\n"
		+ "Age: " + getCustomer().getAge() + "\n Heres a list of Beverages " + orderList;
	}

	public ArrayList<Beverage> getOrderList() 
	{
		return orderList;
	}
}