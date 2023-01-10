import java.util.*;
public class BabyTravels
{
	static int tick=0;
	static Scanner sc = new Scanner(System.in);
	ArrayList<Customer> customer = new ArrayList<Customer>();
	String seat[]=new String[12];
	String berth[] = new String[6];
	static String seatno="";
	static String berthi="";
	static String seatnoCopy="";
	static String berthinoCopy="";
	static int index=0;
	public static void main(String[] args)
	{
		BabyTravels baby = new BabyTravels();
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
					adminWork();
					break;
				case 2:
					userWork();
					break;
			}
		}while(n != 3);
			
	}
	public void adminWork()
	{
		int n=0;
		do
		{
			System.out.println("1.add 2.view 3.Customer Details 4.Exit");
			n = sc.nextInt();
			switch(n)
			{
				case 1:
					add();
					break;
				case 2:
					view();
					break;
				case 3:
					customerDetails();
					break;
			}
		}while(n != 4);
		
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
		}while(n != 4);
		
	}
	public void add()
	{
		System.out.println("Enter a no of Seats to add :");
		int seatss=sc.nextInt();
		for(int i=1;i<=12;i++)
		{
			String temp="";
			temp += i;
			seat[i-1]=temp;
			if(seat[i-1].equals(seatno))
			{
				seat[i-1]="";
				index=i-1;
			}
		
		}
		System.out.println();
		System.out.println("Enter a no of berth to add :");
		int berths=sc.nextInt();
		for(int i=1;i<=6;i++)
		{
			berth[i]="Sleeper";
			if(berth[i-1].equals(seatno))
			{
				berth[i-1]="";
				index=i-1;
			}
		}
	}
	public void view()
	{
		System.out.println("Seats");
		for(int i=0;i<12;i++)
		{
			System.out.print(seat[i]+" ");
		}
		System.out.println();
		System.out.println("Berth");
		for(int i=0;i<6;i++)
		{
			System.out.print(berth[i]+" ");
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
		System.out.println("Enter your Drop location :");
		String drop=sc.next();
		System.out.println("Enter your pickup Location :");
		String pickup = sc.next();
		System.out.println("Enter your Berth");
		String berth=sc.next();
		System.out.println("if you are Booking seats or Berth ");
		System.out.println("1.Seats 2.Berth");
		int check = sc.nextInt();
		if(check == 1)
		{
			System.out.println("Enter a Seatno to book :");
			seatno = sc.next();
			seatnoCopy=seatno;
			
		}
		if(check == 2)
		{
			System.out.println("Enter a berth to book : (berth as Sleeper)");
			berthi = sc.next();
			berthinoCopy=berthi;
		}
		Customer c = new Customer(name,age,gender,phoneno,mail,drop,pickup,berth,tick);
		customer.add(c);
		tick++;
	}
	public void cancelTickets()
	{
		System.out.println("Enter a Cancel seat no :");
		String cancelSeat = sc.next();
		String temp="";
		temp += index;
		if(cancelSeat.equals(temp))
		{
			seat[index]=seatnoCopy;
		}
		
	}
	public void customerDetails()
	{
		System.out.println("\tname\tage\tgender\tphoneno\tmail\tdrop\tpickUp\tberth\tTicketno");
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
	String berth;
	int Ticketno;
	Customer(String name,int age,String gender,long phoneno,String mail,String drop,String pickUp,String berth,int Ticketno)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.phoneno=phoneno;
		this.mail=mail;
		this.drop = drop;
		this.pickUp=pickUp;
		this.berth = berth;
		this.Ticketno=Ticketno;
	}
	public String toString()
	{
		return "\t"+name+"\t"+age+"\t"+gender+"\t"+phoneno+"\t"+mail+"\t"+drop+"\t"+pickUp+"\t"+berth+"\t"+Ticketno;
	}
	
}