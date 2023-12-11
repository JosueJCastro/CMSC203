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

public class Customer 
{
	private String name;
	private int age;
	public Customer(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public Customer(Customer c)
	{
		name = c.getName();
		age = c.getAge();
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	@Override
	public String toString() 
	{
		return "Name: " + name + " Age: " + age;
	}
}
