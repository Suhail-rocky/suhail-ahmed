import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Collection;
class MapDemo2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of Tickets : ");
		int tickets = sc.nextInt();
		Map<Integer,String> Railway = new LinkedHashMap<>();
		int t=15510;
		//add
		for(int i=0;i<tickets;i++)
		{
			System.out.println("Enter a Passenger Name : ");
			String name = sc.next();
			Railway.put(i+t,name);
		}
		System.out.println(Railway);
		//delete
		System.out.println("Enter a Ticket ID :");
		int ticketID=sc.nextInt();
		Railway.remove(ticketID);
		System.out.println("Ticket cancel sucessfully ");
		//update
		System.out.println("Enter a Ticket ID :");
		ticketID=sc.nextInt();
		System.out.println("Enter a updated name :");
		String name=sc.next();
		Railway.replace(ticketID,name);
		//view
		System.out.println(Railway);
		Set<Integer> Ticketno = Railway.keySet();
		Collection<String> names = Railway.values();
		System.out.print(Ticketno+" "+names);
		//contains
		String value = Railway.get("suhail");
		System.out.println(value);
		boolean entryKey = Railway.containsKey("suhail");
		System.out.println(entryKey);
		boolean entryValue = Railway.containsValue("Brown");
		System.out.println(entryValue);		
		
		
	}
}