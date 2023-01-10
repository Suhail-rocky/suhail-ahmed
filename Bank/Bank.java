import java.util.*;
public class Bank{
	static int custid[] = new int[10];
	static int AccountNo[] = new int[10];
	static String Name[] = new String[10];
	static int Balance[] = new int[10];
	static String EP[] = new String[10];
	static String EPN[]=new String[10];
	static String RP[] = new String[10];
	static int account;
	static int amount;
	static int count;
	static int count1;
	static int count2;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username :");
		String username = sc.next();
		System.out.println("Enter a password :");
		String password = sc.next();
		if(username.equals("Bank") && password.equals("Bank123"))
		{
			System.out.println("Login Sucessfully");
			Bank ac = new Bank();
			ac.Account();
		}
		else
		{
			System.out.println("Please Try Again");
		}
		
	}

	public void Account() 
	{
		Scanner sc = new Scanner(System.in);
			System.out.println("1.Add  2.Basic Operation 3.view 4.Top Customer 5.Quit");
			int userchoice = sc.nextInt();
			switch(userchoice)
			{
				case 1:
					Bank b = new Bank();
					b.Add();
					break;
				case 2:
					Bank c = new Bank();
					c.Basic_Operation();
					break;
				case 3:
					Bank d = new Bank();
					d.view();
					break;
				case 4:
					TopCustomer();
					break;
					
				case 5:
					System.exit(0);
					break;
					
				default:
					System.out.println("Try again");
					break;
			}
			Bank a = new Bank();
			a.Account();
	}
			
	
	
	public void Add()
	{
	custid[0]=11;
	custid[1]=22;
	custid[2]=33;
	custid[3]=44;
	Balance[0]=10000;
	Balance[1] = 20000;
	Balance[2]=30000;
	Balance[3]=40000;
	Name[0] = "Kumar";
	Name[1] ="Madhu";
	Name[2]="Rahul";
	Name[3]="Robin";
	AccountNo[0]=11011;
	AccountNo[1]=22022;
	AccountNo[2]=33033;
	AccountNo[3]=44044;
	EPN[0]="ApipNbjm";
	EPN[1]="Cboljoh";
	EPN[2]="dbnqvt";
	EPN[3]="kbwb22";
	RP[0]="ApipNbjm";
	RP[1]="Cboljoh";
	RP[2]="dbnqvt";
	RP[3]="kbwb22";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number of Accounts want to add :");
	account = sc.nextInt();
	int k=4;
	for(int i=0;i<account;i++){
		custid[k] = custid[k-1]+ 1;
		AccountNo[k] = AccountNo[k-1]+1;
		System.out.println("Enter a Account Holder Name :");
		Name[k] =sc.next();
		System.out.println("Enter Password :");
		EP[k]=sc.next();
		System.out.println("Re-Enter Password :");
		RP[k]=sc.next();
		EPN[k]=Encryption(EP[k]);
		Balance[k]=10000;
		k++;
	}
		
	
	}
	public static String Encryption(String password)
	{
		Scanner sc = new Scanner(System.in);
		String temp="";
		for(int i=0;i<password.length();i++)
		{
			temp +=(char)(password.charAt(i)+1);
			
		}
		return temp;
	}
	public void view(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number of Accounts want to view :");
	 account = sc.nextInt();
	int k=0;
	System.out.println("\tcustId\tAccountNo\tName\tBalance\tEncryptionPwd");
	for(int i=0;i<account;i++){
		if(custid[k] != 0)
		{
			System.out.println("\t"+custid[k]+"\t"+AccountNo[k]+"\t\t"+Name[k]+"\t"+Balance[k]+"\t"+EPN[k]);
		k++;
		}
	}
}
	public void Authentication()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number of Accounts want to view :");
	account = sc.nextInt();
	int k=0;
	System.out.println("\tcustId\tEncryptionPwd");
	for(int i=0;i<account;i++){
		if(custid[k] != 0)
		{
			System.out.println("\t"+custid[k]+"\t"+EP[k]);
		k++;
		}
	}
	}
	public void Basic_Operation()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.ATM Withdrawal 2.CashDeposit 3.Account Transfer 4.Transaction History");
		int s =sc.nextInt();
		switch(s)
		{
			case 1:
				Bank atm = new Bank();
				atm.WithDrawal();
				break;
			case 2:
				Bank atms = new Bank();
				atms.CashDeposit();
				break;
			case 3:
				Bank atmi = new Bank();
				atmi.AccountTransfer();
				break;
			
	}
}
public void WithDrawal(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Customer ID:");
	int cid=sc.nextInt();
	System.out.println("Enter a Password :");
	String p=sc.next();
	for(int i=0;i<account;i++)
	{
	if(cid == custid[i] && p.equals(EP[i]))
	{	
		count++;
		System.out.println("Enter the amount to withdraw :");
		amount = sc.nextInt();
		Balance[i] -= amount;
		System.out.println("Your Balance amount is "+Balance[i]);
		
	}
	
	}
}
public void CashDeposit(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Customer ID:");
	int cid=sc.nextInt();
	System.out.println("Enter a Password :");
	String p=sc.next();
	for(int i=0;i<account;i++)
	{
	if(cid == custid[i] && p.equals(EP[i]))
	{
		count1++;
		System.out.println("Enter the amount to Deposit :");
		amount = sc.nextInt();
		Balance[i] += amount;
		System.out.println("Your Balance amount is "+Balance[i]);
		
	}
	
	}
}
public void AccountTransfer(){ 
Scanner sc = new Scanner(System.in);
	System.out.println("Enter a  FROM Customer ID:");
	int cid=sc.nextInt();
	System.out.println("Enter a FROM Customer Password :");
	String p=sc.next();

	for(int i=0;i<account;i++)
	{
	if(cid == custid[i] && p.equals(EP[i]))
	{
		count2++;
		System.out.println("Enter the amount :");
		amount = sc.nextInt();
		Balance[i]-=amount;
		System.out.println("Your Balance amount is "+Balance[i]);
	}
	
	}
	System.out.println("Enter the TO Customer ID :");
	int cid1 = sc.nextInt();
	System.out.println("Enter a TO Customer Password :");
	String p1 = sc.next();
	for(int i=0;i<account;i++)
	{
	if(cid1 == custid[i] && p1.equals(EP[i]))
	{
		
		Balance[i]+= amount;
		System.out.println("Your Balance amount is "+Balance[i]);
		
		
	}
	
	}
	
}
public void Transaction_History(){
	Scanner sc = new Scanner(System.in);
	int Trans_ID[] = new int[15];
	String  Trans_Type[] = new String[15];
	System.out.println("Enter a Customer ID:");
	int cid=sc.nextInt();
	System.out.println("Enter a Password :");
	String p=sc.next();
	for(int i=0;i<account;i++)
	{
	if(cid == custid[i] && p.equals(EP[i]))
	{
		System.out.println("Customer ID - "+custid[i]);
		System.out.println("Name -"+Name[i]);
		System.out.println("Account No "+AccountNo[i]);
		System.out.println("\tTrans ID\tTrans Type \tAmount \tBalance ");
		Trans_ID[0]=1;
		Trans_ID[i]+=1;
		if(count == 1)
		{
			Trans_Type[i] = "WithDrawal";
		}
		if(count1 == 1)
			{
			Trans_Type[i] = "CashDeposit";
		}
		if(count2 == 1)
		{
			Trans_Type[i] = "Account Transfer";
		}
		
		if(Trans_ID[i] != 0)
		{
			System.out.println("\t"+Trans_ID[i]+"\t\t"+Trans_Type[i]+"\t"+amount+"\t"+Balance[i]);
		}
		
	}

	}
	
}
public void TopCustomer(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number of Accounts want to view :");
	 account = sc.nextInt();
	int k=0;
	int max = Balance[0];
	System.out.println("\tcustId\tAccountNo\tName\tBalance\tEncryptionPwd");
	for(int i=0;i<=account;i++){
		if(custid[k] != 0)
		{
			if(max < Balance[i])
			{
				System.out.println("\t"+custid[k]+"\t"+AccountNo[k]+"\t\t"+Name[k]+"\t"+Balance[k]+"\t"+EP[k]);
			}
			
		k++;
		}
	}
}

public void Password_History(){
	
}
public void Operationalfee(){
}
public void maintanencefee(){
	
}
}
