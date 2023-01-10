import java.util.*;
public class Railway
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1.Admin 2.User");
		
	}
}
abstract class RailwayReservation
{
	public abstract void book();
	public abstract void cancel();
	public abstract void printBookedtickets();
	public abstract void printAvailableTickets();
}
class User extends RailwayReservation
{
	public void tickets()
	{
		System.out.println("1.Add 2.Cancel 3.printBookedtickets 4.printAvailableTickets");
		int check = sc.nextInt();
		RailwayReservation railway = new User();
		switch(check)
		{
			case 1:
			railway.add();
			break;
			case 2:
			
				
	public void add()
	{
	}
	public void cancel()
	{
	}
	public void printBookedtickets()
	{
	}
	public void printAvailableTickets()
	{
	}
}
	