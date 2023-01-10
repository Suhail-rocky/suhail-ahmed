import java.util.*;
public class Bank_Management extends Account_Login
{
	public static void main(String[] args)
	{
		
		Bank_Management b = new Bank_Management();
		switch
		b.Admin();
		b.userSignUp();
		b.userSignIn();
		AccountDetails Ad = new AccountDetails();
		Ad.accountDetails();
		
	}
}
class Account_Login
{
	
	Scanner sc = new Scanner(System.in);
	public void Admin()
	{
	
	String customer_id="Bank";;
	String Password="Bank123";
	System.out.println("Enter a Customer ID : ");
	String CustomerID=sc.next();
	System.out.println("Enter a Password : ");
	String password=sc.next();
	if(customer_id.equals(CustomerID) && Password.equals(password))
	{
		System.out.println("Login Sucessfully");
	}
	else
	{
		System.out.println("Try Again");
		Account_Login obj = new Account_Login();
		obj.Admin();

	}
	}
	static String Username;
	static String UPassword;
	public void userSignUp()
	{
		System.out.println("Enter a UserName :");
		Username = sc.next();
		System.out.println("Enter a Password ");
		UPassword=sc.next();
		System.out.println("Signed Up Sucessfully");
	}
	public void userSignIn()
	{
		System.out.println("Enter a UserName :");
		String UserName = sc.next();
		System.out.println("Enter a Password ");
		String Upassword=sc.next();
		if(Username.equals(UserName) &&  Upassword.equals(UPassword))
		{
			System.out.println("Signed Up Sucessfully");
			System.out.println("Login Sucessfully");
		}
		else
		{
			System.out.println("Try Again");
			Account_Login obj1 = new Account_Login();
			obj1.userSignUp();
			obj1.userSignIn();
		}
	}
}
	
class Bank{
	public void accountDetails()
	{
		Scanner sc = new Scanner(System.in);
		AccountDetails Ad = new AccountDetails();
		System.out.println("Enter 1.GiftCard 2.TopUp 3.Transaction History 4.Block 5.Logging Out 6.Purchase 7.reweedPoint 8.multiple Gifts 9.Exit");
		int UserChoice = sc.nextInt();
		switch(UserChoice)
		{
			case 1:
				Ad.createAccount();
				Ad.giftCard();
				break;
			case 2:
				Ad.topUp();
				break;
			case 3:
				Ad.transactionHistory();
				break;
			case 4:
				Ad.block();
				Ad.giftCard();
				break;
			case 5:
				Ad.accountDetails();
				//Ad.loggingout();
				break;
			case 6:
				Ad.purchase();
				break;
			case 7:
				Ad.reweedPoint();
				break;
			case 8:
				Ad.multipleGifts();
				Ad.createAccount();
				Ad.giftCard();
				break;
			case 9:
				Ad.Exit();
			
			}
			Ad.accountDetails();
		}
	}

	
class AccountDetails extends Bank
{
	Scanner sc = new Scanner(System.in);
	static String giftcard[] = {"12345","12346","12347","12348","12349","12350"};
	static String password[]={"1234","1235","1236","1237","1238","1239"};
	static int mainaccountbalance = 10000;
	static String Name[] = new String[100];
	static String A_T[]=new String[100];
	static int amount[] = new int[100];
	static int Balance[] = new int[100];
	static int mainBalance[] = {5000,1000,10000};
	static int account;
	static int Purchase_Amount;
	static int balance;
	public void createAccount()
	{
		System.out.println("Enter a Number of Accounts You want to create :");
		int k=0;
		account = sc.nextInt();
		for(int i=0;i<account;i++)
		{
			System.out.println("Enter your Name : ");
			Name[k] = sc.next();
			System.out.println("Enter your Account Type  as Savings and Current : ");
			A_T[k]=sc.next();
			k++;
		}
	}		
	public void giftCard()
	{
		System.out.println("If you want see GiftCard Press 1");
		int n = sc.nextInt();
		if(n==1)
		{
			System.out.println("Enter a number of Accounts : ");
			int a = sc.nextInt();
			for(int i=0;i<a;i++)
			{
				System.out.println("Gift Card Number id "+giftcard[i]);
				System.out.println("4 Digit Password is "+password[i]);
			}
		}
		
		
	}
	public void topUp()
	{
		
		System.out.println("Enter a Number of Accounts You want to create :");
		int k=0;
		account = sc.nextInt();
		for(int i=0;i<account;i++)
		{
		System.out.println("Enter a TopUp Amount ");
		amount[k] = sc.nextInt();
		Balance[k] = mainBalance[k] - amount[k];
		k++;
		}
	}
	public void transactionHistory()
	{
		System.out.println("Enter a Number of Accounts You want to create :");
		account = sc.nextInt();
		System.out.println("Gift Card No\tAccount Name\tAccount Type\tBalance");
		for(int i=0;i<account;i++)
		{
			if(Name[i] != "")
			{	
				System.out.println(giftcard[i]+"\t\t"+Name[i]+"\t\t"+A_T[i]+"\t\t"+Balance[i]);
			}
		}
	}
	public void block()
	{
		System.out.println("Enter a GiftNumber");
		String Gn = sc.next();
		System.out.println("Enter a Number of Accounts You want to Block :");
		account = sc.nextInt();
		for(int i=0;i<account;i++)
		{
			if(Gn == giftcard[i])
			{
				Name[i] =null;
				A_T[i]=null;
				Balance[i]=0;
			}
		}

	}
	public void Exit()
	{
		System.exit(0);
	}
	public void purchase()
	{
		System.out.println("Enter your gift Card Number :");
		String giftcardno=sc.next();
		System.out.println("Enter a Number of Accounts You want to See :");
		account = sc.nextInt();
		for(int i=0;i<account;i++)
		{
			if(giftcardno == giftcard[i])
			{
				System.out.println("Enter your Purchase Amount");
				Purchase_Amount = sc.nextInt();
				int balance = mainBalance[i] - Purchase_Amount;
				System.out.println("The Balance Amount is "+balance);
			}
		}
	}
	public void reweedPoint()
	{
		int reward_point =0;
		if(Purchase_Amount == 100)
		{
			reward_point++;
		}
		if(reward_point == 10)
		{
			balance+=10;
		}
		System.out.println("The Balance Amount is "+balance);
		System.out.println("The Reward Point is "+reward_point);
	}
	public void multipleGifts()
	{
		//Ad.giftCard();
	}
	

}
