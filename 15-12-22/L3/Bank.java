import java.util.*;
public class Bank
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("\t\t\tWelcome to Bank");
		User bank1 = new User();
		bank1.bankUser();
	}
}
interface Banks
{
	public void addNewCustomer();
	public void basicOperations();
	public void transactionHistory();
	public void topCustomers();
	public void operationalFee();
	public void maintenanceFee();
	
}
class User extends Admin implements Banks 
{
	static Scanner sc = new Scanner(System.in);
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
				System.exit(0);
				break;
		}
		User banks = new User();
		banks.bankUser();
		
				
	}
	static ArrayList<Integer> CustId= new ArrayList<Integer>();
	static ArrayList<String> name = new ArrayList<String>();
	static ArrayList<String> password = new ArrayList<String>();
	static ArrayList<Integer> Balance=new ArrayList<Integer>();
	static ArrayList<Integer> accountno = new ArrayList<Integer>();
	
	private void generateCustId()
	{
		for(int i=0;i<2;i++)
		{
			CustId.add(i*11);
		}
		//System.out.println(accountno);	
		
	}
	private void generateBalance()
	{
		for(int i=0;i<2;i++)
		{
			Balance.add(i,10000);
		}
		//System.out.println(accountno);	
		
	}
	private void generateaccountno()
	{
		for(int i=0;i<2;i++)
		{
			accountno.add(i*10000+1);
		}
		//System.out.println(accountno);	
		
	}
	public void Initialize()
	{
		System.out.println("\tCustId \tAccountNo \tName \tBalance \tEncryptedPwd");
		for(int i=0;i<2;i++)
		{
			System.out.println("\t"+CustId.get(i)+"\t\t"+accountno.get(i)+"\t\t"+name.get(i)+"\t\t"+Balance.get(i)+"\t"+password.get(i));
		}
	}
	public void addNewCustomer()
	{
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter your username :");
			String names=sc.next();
			name.add(names);
			System.out.println("Enter your Password :");
			String passwords = sc.next();
			System.out.println("Re-Enter a Password :");
			String Repassword =sc.next();
			if(passwords.equals(Repassword))
			{
				password.add(passwords);
			}	
		}	
		User bank2 = new User();
			bank2.generateCustId();
			bank2.generateBalance();
			bank2.generateaccountno();
			bank2.Initialize();
	}
	public void basicOperations()
	{
		System.out.println("1.ATM WithDrawal 2.CashDeposit 3.Account Transfer ");
		int check = sc.nextInt();
		User user = new User();
		switch(check)
		{
			case 1:
				user.atmWithdrawal();
				break;
			case 2:
				user.cashDeposit();
				break;
			case 3:
				user.accountTransfer();
				break;
	}
	}
	private void atmWithdrawal()
	{
		System.out.println("Enter your username :");
		String username = sc.next();
		System.out.println("Enter your password :");
		String password = sc.next();
		System.out.println("Enter your account no :");
		int accountno = sc.nextInt();
		for(int i=0;i<2;i++)
		{
			String s = name.get(i);
			if(username.equals(s) )
			{
				System.out.println("Enter a Balance amount to be added");
				int amt = sc.nextInt();
				Balance.add(i,amt);
			}
		}
		User bank3 = new User();
		bank3.Initialize();
	}
	
	private void cashDeposit()
	{
	}
	private void accountTransfer()
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
class Admin 
{
	/*static Scanner sc = new Scanner(System.in);
	ArrayList<Integer> accountno= new ArrayList<Integer>();
	private void generateAccountNo()
	{
		for(int i=1;i<10;i++)
		{
			accountno.add(i*11);
		}
		System.out.println(accountno);
		
		
	}
	private void encryption()
	{
	}
	private void authentication()
	{
	}
	private void changePassword()
	{
	}
	private void passwordHistory()
	{
	}
	private void forcePasswordChange()
	{
	}
	public void AdminOnly()
	{
		System.out.println("Enter a username :");
		String name =sc.next();
		System.out.println("Enter a password : ");
		String password = sc.next();
		if(name.equals("suhail")&&password.equals("123"))
		{
			System.out.println("Enter 1.generateAccountNo");
			int check = sc.nextInt();
			switch(check)
			{
				case 1:
					Admin admin1 = new Admin();
					admin1.generateAccountNo();
					break;
			}
		/*encryption();
		authentication();
		changePassword();
		passwordHistory();
		forcePasswordChange();
		
	}
	}*/
}