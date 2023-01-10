import java.util.*;
public class Parking
{
	static Scanner sc = new Scanner(System.in);
	static int m=1001;
	ArrayList<Parkings> park = new ArrayList<>();
	ArrayList<Parks> Upark = new ArrayList<>();
	public static void main(String[] args)
	{
		Parking p = new Parking();
		p.login();
	}
	public void login()
	{
		int n=0;
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
			System.out.println("1.Create 2.Display 3.vehicleDetails 4.Exit");
			n = sc.nextInt();
		switch(n)
		{
			case 1:
				create();
				break;
			case 2:
				display();
				break;
			case 3:
				vehicleDetails();
				break;
			
		}
		}while( n!=4);
			
	}
	public void userWork()
	{
		int n=0;
		do
		{
			System.out.println("1.Park Vehicles 2.UnParkVehicles 3.Exit");
			n = sc.nextInt();
			switch(n)
			{
				case 1:
					parkVehicles();
					break;
				case 2:
					unParkVehicles();
					break;
			}
		}while( n != 3);
		}
	public void create()
	{
		String temp ="PR1234 ";
		System.out.println("Enter a no of floors :");
		int floors = sc.nextInt();
		System.out.println("Enter a no of slots :");
		int slots = sc.nextInt();
		temp = temp +"_"+ floors;
		temp = temp +"_"+ slots;
		String parkId=temp;
		Parkings p = new Parkings(parkId,floors,slots);
		park.add(p);
	}
	public void display()
	{
		System.out.println("\t Parking ID \t No of Floors \t no of Slots ");
		for(int i=0;i<park.size();i++)
		{
			System.out.println(park.get(i));
		}
	}
	public void parkVehicles()
	{
		
		System.out.println("Enter a Vehicle Type :");
		String vehicleType = sc.next();
		System.out.println("Enter a reg no :");
		String regno = sc.next();
		System.out.println("Enter a Color :");
		String color = sc.next();
		Parks ps = new Parks(m,vehicleType,regno,color);
		Upark.add(ps);
		m++;
		System.out.println("Ticket allocated Sucessfully");
		System.out.println("Your Ticket ID is"+m);
	}
	public void unParkVehicles()
	{
		if(Upark.size() != 0)
		{
			System.out.println("Enter a Ticket ID :");
			int ticketID=sc.nextInt();
			for(int i=0;i<Upark.size();i++)
			{
				if(ticketID == Upark.get(i).ticketID)
				{
					System.out.println("Unparked Sucessfully");
					Upark.remove(i);
				}
			}
		}
		else
		{
			System.out.println("Wrong Id ! Try again ");
			parkVehicles();
		}
	}	
	public void vehicleDetails()
	{
		System.out.println("\t ticketID \t Vehicle Type \t regno \t Color");
		for(int i=0;i<Upark.size();i++)
		{
			System.out.println(Upark.get(i));
		}
	}
}
class Parkings
{
	String parking_lot_id;
	int no_of_floors;
	int no_of_slots_per_floor;
	Parkings(String parking_lot_id,int no_of_floors,int no_of_slots_per_floor)
	{
		this.parking_lot_id=parking_lot_id;
		this.no_of_floors=no_of_floors;
		this.no_of_slots_per_floor=no_of_slots_per_floor;	
	}
	public String toString()
	{
		return "\t"+parking_lot_id+"\t\t"+no_of_floors+"\t\t"+no_of_slots_per_floor;
	}
}
class Parks
{
	int ticketID;
	String vehicleType;
	String regno;
	String color;
	Parks(int ticketID,String vehicleType,String regno,String color)
	{
		this.ticketID=ticketID;
		this.vehicleType=vehicleType;
		this.regno=regno;
		this.color=color;
	}
	public String toString()
	{
		return "\t"+ticketID+"\t\t"+vehicleType+"\t\t"+regno+"\t\t"+color;
	}
	
}