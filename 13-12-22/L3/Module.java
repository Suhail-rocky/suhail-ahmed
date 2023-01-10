import java.util.*;
public class Module{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		LoginPage lp = new LoginPage();
		System.out.println("Enter 1.Admin 2.User");
		int login = sc.nextInt();
		switch(login)
		{
			case 1:
				lp.Admin();
				break;
			case 2:
				lp.User();
				break;
			default:
				System.out.println("Try Again");
		}
			
	}
}
class LoginPage
{
	static Scanner sc = new Scanner(System.in);
	
	public void Admin()
	{
		Library library = new Admin();
		System.out.println("1.Add 2.view 3.Update 4.Delete");
		int admin = sc.nextInt();
		switch(admin)
		{
			case 1:
				library.add();
				break;
			case 2:
				library.view();
				break;
			case 3:
				library.update();
				break;
			case 4:
				library.delete();
				break;
		}
		System.out.println("Do you want to continue Yes or No ");
		String check = sc.next();
		if(check.equals("Yes"))
		{
			LoginPage l = new LoginPage();
			l.Admin();
		}
	}
	public void User()
	{
		
	}
	
}
interface Library
{
	public void add();
	public void view();
	public void update();
	public void delete();
}
class Admin implements Library{
	static Scanner sc = new Scanner(System.in);
	static int n=100;
	static int bookid[] = new int[n];
	static String bookname[] = new String[n];
	static int bookprice[] = new int[n];
	int k=0;
	public void add()
	{
		System.out.println("How many books you want to add :");
			System.out.println("Enter a Book ID :");
			bookid[k]=sc.nextInt();
			System.out.println("Enter BookName :");
			bookname[k]=sc.next();
			System.out.println("Enter bookprice :");
			bookprice[k]=sc.nextInt();
			k++;
		LoginPage l = new LoginPage();
		l.Admin();
	}
	
	public void view()
	{
		System.out.println("How many books you want to view");
		int total=sc.nextInt();
		System.out.println("\tBookID\tBookName\tbookprice");
		for(int i=0;i<k;i++)
		{
			System.out.print("\t"+bookid[i]+"\t"+bookname[i]+"\t"+bookprice[i]);
		}
	}
	public void update()
	{
	}
	public void delete()
	{
	}
}
class User 
{
	
}