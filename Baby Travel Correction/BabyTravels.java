import java.util.*;
import java.util.regex.*;
public class BabyTravels
{
	static int tick=1001;
	static Scanner sc = new Scanner(System.in);
	ArrayList<Customer> customer = new ArrayList<Customer>();
	ArrayList<String> userName = new ArrayList<String>();
	ArrayList<String> PassWord = new ArrayList<String>();
	String seat[]=new String[12];
	String berths[] = new String[6];
	public static void main(String[] args)
	{
		
		BabyTravels baby = new BabyTravels();
		baby.add();
		baby.Login();
	}
	public void Login()
	{
		int n = 0;
		do
		{
			System.out.println("1.Admin 2.User 3.Exit");
			n = sc.nextInt();
			switch(n)
			{
				case 1:
					admin();
					break;
				case 2:
					user();
					break;
			}
		}while(n != 3);
			
	}
	public void admin()
	{
		System.out.println("Enter a admin name :");
		String adminname = sc.next();
		System.out.println("Enter a Password :");
		String adminpassword = sc.next();
		if(adminname.equals("admin") && adminpassword.equals("admin123"))
		{
			System.out.println("Login sucessfully");
			 adminWork();
		}
		else
		{
			System.out.println("try Again");
			admin();
		}
	}
	public void user()
	{
		int n = 0;
		do{
			System.out.println("1.SignUp 2.SignIn 3.Exit");
			n=sc.nextInt();
			switch(n)
			{
				case 1:
					signUp();
					break;
				case 2:
					signIn();
					break;
			}
		}while(n != 3);
		
	}
	public void signUp()
	{
		System.out.println("Enter a UserName :");
		String username=sc.next();
		userName.add(username);
		System.out.println("Enter a Password :");
		String password = sc.next();
		boolean ans = checkPassword(password);
		if(ans == true)
		{
			PassWord.add(password);
			System.out.println("Sign Up SucessFully");
		}
		else
		{
			System.out.println("Try Again Kindly Check your Password !");
			signUp();
			
		}
	}
	public void signIn()
	{
		int count = 0;
		System.out.println("Enter a UserName :");
		String username=sc.next();
		System.out.println("Enter a Password :");
		String password = sc.next();
		for(int i=0;i<userName.size();i++)
		{
			if(userName.get(i).equals(username))
			{
				count++;
			}
		}
		for(int i=0;i<PassWord.size();i++)
		{
			if(PassWord.get(i).equals(password))
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println("Sign in Sucessfully" );
			count=0;
			userWork();
		}
		else
		{
			signUp();
		}
	}
	 private boolean checkPassword(String password)
    {
        String regex="^(?=.*[a-z])+(?=.*[0-9])+(?=.*[A-Z])+(?=.*[!@#$%&*%])+(?=[\\S+$]).{8,20}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(password);
        boolean var=m.matches();
        return var;


    }
	public void adminWork()
	{
		int n=0;
		do
		{
			System.out.println("1.view 2.Customer Details 3.Exit");
			n = sc.nextInt();
			switch(n)
			{
				case 1:
					view();
					break;
				case 2:
					customerDetails();
					break;
			}
		}while(n != 3);
		
	}
	public void userWork()
	{
		int n=0;
		do
		{
			System.out.println("1.view tickets 2.Book Tickets 3.Cancel 4.view Details 5.Exit");
			n = sc.nextInt();
			switch(n)
			{
				case 1:
					view();
					break;
				case 2:
					bookTickets();
					break;
				case 3:
					cancelTickets();
					break;
				case 4:
					customerDetails();
					break;
			}
		}while(n != 5);
		
	}
	public void add()
	{
		int seatss=12;
		for(int i=1;i<=seatss;i++)
		{
			String temp="";
			temp += i;
			seat[i-1]=temp;

		}
		int b=6;
		for(int i=1;i<=b;i++)
		{
			berths[i-1]="u"+i;
		}
		System.out.println(seatss+" seats  are available ");
		System.out.println(b+" berths   are available");
	}
	
	public void view()
	{
		System.out.println("Seats");
		for(int i=0;i<12;i++)
		{
			if(i % 2 != 0)
			{
			System.out.println(seat[i]+" ");
			}
			else
			{
			System.out.print(seat[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Berth");
		for(int i=0;i<6;i++)
		{
			if(i % 2 != 0)
			{
			System.out.println(berths[i]+" ");
			}
			else
			{
			System.out.print(berths[i]+" ");
			}
		}
		System.out.println();
	}
	public void bookTickets()
	{
		System.out.println("Enter your name :");
		String name = sc.next();
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		System.out.println("Enter your Gender :");
		String gender = sc.next();
		System.out.println("Enter your Phone Number :");
		long phoneno = sc.nextLong();
		System.out.println("Enter your mail ID :");
		String mail = sc.next();
		System.out.println("Enter your pickup Location :");
		String pickup = sc.next();
		System.out.println("Enter your Drop location :");
		String drop=sc.next();
		System.out.println("if you are Booking seats or Berth ");
		System.out.println("1.Seats 2.Berth");
		int check = sc.nextInt();
		if(check == 1)
		{
			System.out.println("Enter a Seatno to book :");
			String seatno = sc.next();
			for(int i=1;i<=12;i++)
			{
				String temp ="";
				temp += i;
				if(seatno.equals(temp))
				{
					seat[i-1]=" ";
				}
				
			}
			System.out.println("Ticket Booked Sucessfully ");
			System.out.println("Ticket No : "+tick);
			
		}
		if(check == 2)
		{
			System.out.println("Enter a berth to book : ");
			String berthi = sc.next();
			for(int i=1;i<=6;i++)
			{
				String temp="";
				temp ="u";
				temp += i;
				if(berthi.equals(temp))
				{
					berths[i-1]=" ";
				}
				
			}
			System.out.println("Ticket Booked Sucessfully ");
			System.out.println("Ticket No : "+tick);
		}
		Customer c = new Customer(name,age,gender,phoneno,mail,drop,pickup,tick);
		customer.add(c);
		tick++;
	}
	public void cancelTickets()
	{
		System.out.println("1.SeatNo 2.Berth");
		int check = sc.nextInt();
		if(check == 1)
		{
			System.out.println("Enter a Cancel seat no :");
			String cancelSeat = sc.next();
			for(int i=1;i<=12;i++)
			{
				String temp = "";
				temp += i;
				if( cancelSeat.equals(temp))
				{
				customer.remove(i-1);
				seat[i-1]=temp;
				}
			}
		}
		if(check == 2)
		{
			System.out.println("Enter a Cancel seat no :");
			String cancelBertht = sc.next();
			for(int i=0;i<=6;i++)
			{
				String temp ="";
				temp = "u";
				temp += i;
				if(cancelBertht.equals(temp))
				{
					customer.remove(i-1);
					berths[i-1]=cancelBertht;
				}
			}
		}
		
	}
	public void customerDetails()
	{
		System.out.println("\tTicketno\tname\tage\tgender\tphoneno\tmail\tdrop\tpickUp");
		for(int i=0;i< customer.size();i++)
		{
			System.out.println(customer.get(i));
		}
	}
	
}
class Customer
{
	String name;
	int age;
	String gender;
	long phoneno;
	String mail;
	String drop;
	String pickUp;
	int Ticketno;
	Customer(String name,int age,String gender,long phoneno,String mail,String drop,String pickUp,int Ticketno)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.phoneno=phoneno;
		this.mail=mail;
		this.drop = drop;
		this.pickUp=pickUp;
		this.Ticketno=Ticketno;
	}
	public String toString()
	{
		return "\t"+Ticketno+"\t"+name+"\t"+age+"\t"+gender+"\t"+phoneno+"\t"+mail+"\t"+drop+"\t"+pickUp;
	}
	
}