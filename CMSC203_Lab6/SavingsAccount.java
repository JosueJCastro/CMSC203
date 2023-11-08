
public class SavingsAccount extends BankAccount
{
	double rate = 0.025;
	int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double balance)
	{
		super(name, balance);
		accountNumber = super.getAccountNumber()+"-"+savingsNumber;
		
	}
	public SavingsAccount(SavingsAccount oldAccount, double amount)
	{
		super(oldAccount, amount);
		// Update savings number so then we can add it to the next copy and add one more at the end num
		savingsNumber++;
		accountNumber = super.getAccountNumber()+"-10"+savingsNumber;
	}
	public void postInterest()
	{
		double holder;
		holder = (super.getBalance() * rate) / 12;
		super.deposit(holder);
	}
	@Override
	public String getAccountNumber()
	{
		return this.accountNumber;
	}
} 
