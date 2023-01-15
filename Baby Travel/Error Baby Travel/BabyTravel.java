import java.util.*;
public class BabyTravel
{
	static int tick=1001;
	static Scanner sc = new Scanner(System.in);
	ArrayList<Customer> customer = new ArrayList<Customer>();
	String seat[]=new String[12];
	String berths[] = new String[6];
	static String seatno="";
	static String berthi="";
	static String seatnoCopy="";
	static String berthinoCopy="";
	static int index=0;
	static int count=0,count1=0;
	public static void main(String[] args)
	{
		
		BabyTravel baby = new BabyTravel();
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
			berths[i-1]="U"+i;
		}
		System.out.println(seatss+" seats  are available ");
		System.out.println(b+" berths   are available ");
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
		int fare=0;
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
			fare = 200;
			System.out.println("Enter a Seatno to book :");
			seatno = sc.next();
			for(int i=1;i<=12;i++)
			{
				String temp ="";
				temp += i;
				if(seatno.equals(temp))
				{
					seat[i-1]=" ";
					count++;
				}
					
			}
			Booked();
			System.out.println("Ticket Booked Sucessfully ");
			System.out.println("Ticket No : "+tick);
			
		}
		if(check == 2)
		{
			fare = 400;
			System.out.println("Enter a berth to book : ");
			berthi = sc.next();
			for(int i=1;i<=6;i++)
			{
				String temp="";
				temp ="U";
				temp += i;
				if(berthi.equals(temp))
				{
					berths[i-1]=" ";
				}
				if(berths[i-1].equals(" "))
				{
					System.out.println(berths[i-1]+"is already Booked");
					System.out.println("Try Again");
					bookTickets();
				}
				
			}
			System.out.println("Ticket Booked Sucessfully ");
			System.out.println("Ticket No : "+tick);
		}
		Customer c = new Customer(name,age,gender,phoneno,mail,drop,pickup,tick,fare);
		customer.add(c);
		tick++;
	}
	public void Booked()
	{
		for(int i=1;i<=12;i++)
		{
			if(seat[i-1].equals(" "))
			{
				System.out.println(i+" is already Booked");
			}
				
		}
			System.out.println("Enter a Seatno to book :");
			seatno = sc.next();
			for(int i=1;i<=12;i++)
			{
				String temp ="";
				temp += i;
				if(seatno.equals(temp))
				{
					seat[i-1]=" ";
				}
					
			}
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
				temp = "U";
				temp += i;
				if(cancelBertht.equals(temp))
				{
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
	int fare;
	int Ticketno;
	Customer(String name,int age,String gender,long phoneno,String mail,String drop,String pickUp,int Ticketno,int fare)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.phoneno=phoneno;
		this.mail=mail;
		this.drop = drop;
		this.pickUp=pickUp;
		this.Ticketno=Ticketno;
		this.fare = fare;
	}
	public String toString()
	{
		return "\t"+Ticketno+"\t"+name+"\t"+age+"\t"+gender+"\t"+phoneno+"\t"+mail+"\t"+drop+"\t"+pickUp+"\t"+fare;
	}
	
}