import java.utlil.*;
public class Bank
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(
	
	}
}
interface Banks
{
	private static void generateAccountNo()
	{
	}
	
	private static  void encryption()
	{
	}
	private static void authentication()
	{
	}
	public void addNewCustomer();
	public void basicOperations();
	public void transactionHistory();
	public void topCustomers();
	public void operationalFee();
	public void maintenanceFee();
	private static void changePassword()
	{
	}
	private static void passwordHistory()
	{
	}
	private static void forcePasswordChange()
	{
	}
	public void AdminOnly()
	{
		generateAccountNo();
		encryption();
		authentication();
		changePassword();
		passwordHistory();
		forcePasswordChange();
		
	}
}
class User implements Banks
{
	public void bankUser()
	{
		System.out.println("Enter 1.Add 2.basic Operations 3.Transaction History 4.Top Customers 5.Quit");
		int user = sc.nextInt();
		Banks bank = new User();
		switch(user)
		{
			case 1:
				bank.addNewCustomer();
				break;
			case 2:
				bank.basicOperations();
				break;
			case 3:
				bank.transactionHistory();
				break;
			case 4:
				bank.topCustomers();
				break;
			case 5:
				Bank.main(null);
				break;
		}
		bank.bankUser();
				
	}
	public void addNewCustomer()
	{
	}
	public void basicOperations()
	{
	}
	public void transactionHistory()
	{
	}
	public void topCustomers()
	{
	}
	public void operationalFee()
	{
	}
	public void maintenanceFee()
	{
	}
}

