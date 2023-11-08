
public class CheckingAccount extends BankAccount
{
	final static double FEE = 0.15;
	
	public CheckingAccount(String name,int amount)
	{
		super(name, amount);
		super.setAccountNumber(super.getAccountNumber()+"-10");
	}
	@Override
	public boolean withdraw(double amount)
	{
		double full = amount + FEE;
		boolean flag = super.withdraw(full);
		return flag;
	}
}	
