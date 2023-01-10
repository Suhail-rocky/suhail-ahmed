import java.util.*;
class RailwayReservations
{
	public static void main(String[] args)
	{
		int a = 0;
		do{
			System.out.println("Enter the Option as 1.Available Ticket 2.BookTickets 3.Cancel Ticket 4.BookedTicket 5.Exit");
			a = scan.nextInt();
			switch(a)
			{
				case 1:
					AvailableTicket At = new AvailableTicket();
					At.showDetails();
					break;
				case 2:
					BookTicket Bt = new BookTicket();
					Bt.BookTickets();
					break;
				case 3:
					CancelTickets Ct = new CancelTickets();
					Ct.CancelTicket();
					break;
				case 4:
					BookedTicket Bdt = new BookedTicket();
					Bdt.showTicket();
					break;
			}
		}
		while(a!=5);
	}
}
class passengerDetails
{
	Scanner scan = new Scanner(System.in);
	String Origin;
	String Destination;
	static int upper = 2;
	static int lower = 2;
	static int middle = 2;
	static int Rac = 2;
	static int wl = 2;
	static int totalseat = 10;
	static String From = "Chennai";
	static String To = "Bamgalore";
	static String Date = "11/10/2022";
	static String Atime = "6.00 A.M";
	static String Dtime = "1.00P.M";
	static String Pnr[] = new String[100];
	static String Name[] = new String[100];
	static int Age[] = new String[100];
	static int Seatno[] = new String[100];
	static String Gender[] = new String[100];
	static int fare[] = new String[100];
	static String Berth[] = new String[100];
	int temp = 0;
}
class BookTicket extends passengerDetails
{
	static int pvalue=1;
	static String pnr;
	static int count = 0;
	static int seno = 1;
	static BookTicket obj = new BookTicket();
	void BookTickets()
	{
		System.out.println("Enter how many tickets you want to book ");
		int n = scan.nextInt();
		if(seno <= 6)
		{
			pnr = Integer.toString(pvalue);
			obj.setTicket(n,pnr);
		}
		else if(seno > 6 && seno <= 8)
		{
			pnr = Integer.toString(pvalue);
			obj.setTicket(n,pnr);
		}
		else if(seno > 8 && seno <= 10)
		{
			pnr ="WL";
			obj.setTicket(n,pnr);
		}
		else
			System.out.println("No Tickets are available ");
	}
	void setTicket(int n,String pnr)
	{
		for(int i=0;i<n;i++)
		{
			pnr[count] = pnr;
			System.out.println("Enter the Passenger Name ");
			String na = scan.nextInt();
			Name[count] = na;
			System.out.println("Enter the Passenger Age");
			int ag = scan.nextInt();
			Age[count] = ag;
			if(ag>5)
				Seatno[count] = seno++;
			else
				Seatno[count]=0;
			System.out.println("Enter the Passenger Gender ");
			String gen = scan.next();
			Gender[count] = gen;
			if(ag>5)
				Fare[count]=400;
			else if(ag >= 60 || ag <= 5){
				Fare[count] = 200;
				boolean check = false;
				if(totalseat>0)
				{
					if(ag>60)
					{
						check=lower!=0?true:false;
						if(check == true)
						{
							Berth[count]="Lower";
							--lower;
							--totalseat;
						}
						else{
							System.out.println("No Lower Available ");
							obj.berthPreference(count);
						}
					}
					else
					{
						if(ag>5)
						{
							obj.berthPreference(count);
						}
						else
						{
							Berth[count] = "no Berth";
						}
					}
					++count;
				}
				++pvalue;
				System.out.println("Ticket Booked Sucessfully");
			}
			void berthPreference(int count)
			{
				System.out.println("Enter the Berth Prefernce as 1.lower 2.Middle 3.Upper 4.RAC 5.WL");
				int pref = scan.nextInt();
				--totalseat;
				switch(pref)
				{
					case 1:
						obj.lowerBerth(count);
						break;
					case 2:
						obj.middleBerth(count);
						break;
					case 3:
						obj.upperBerth(count);
						break;
					case 4:
						obj.Rac(count);
						break;
					case 5:
						obj.WaitingList(count);
						break;
				}
			}
			void lowerBerth(int count)
			{
				if(lower != 0)
				{
					Berth[count] = "Lower";
					--lower;
				}
				else
				{					
					System.out.println("Lower Berth is Full");
					obj.upperBerth(count);
				}
			}
			void upperBerth(int count)
			{
				if(upper != 0)
				{
					Berth[count] = "Upper";
					--upper;
				}
				else
				{
					System.out.println("upper Berth is Full");
					obj.middleBerth(count);
				}
			}
			void middleBerth(int count)
			{
				if(middle != 0)
				{
					Berth[count] ="Middle";
					--middle;
				}
				else
				{	
					System.out.println("Middle Birth is full");
					obj.Rac(count);
				}
			}
			void Rac(int count)
			{
				if(Rac != 0)
				{
					Berth[count]="Rac";
					--Rac;
				}
				else
				{
					System.out.println("RAC is Full ");
					obj.WaitingList(count);
				}
			}
			void WaitingList(int count)
			{
				if(wl != 0)
				{
					Berth[count] = "Waiting List ";
					--wl;
				}
				else 
				{
					System.out.println("No Tickets are available ");
				}
			}
		}
		class BookedTicket extends passengerDetails{
			void showTicket()
			{
				System.out.println("\t\tFrom\t\tTo
				
						
						
	
	