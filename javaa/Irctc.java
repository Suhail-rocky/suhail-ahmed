import java.util.*;
class Irctc
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int a=0;
		do
		{
		System.out.println("Enter the option as 1.AvailableTicket 2.BookTicket 3.CancelTicket 4.BookedTicket  5.Exit");
		 a=scan.nextInt();
		switch(a)
		{
			case 1:
		    AvailableTicket At=new AvailableTicket();
			At.showDetails();
			break;
			case 2:
			BookTicket Bt=new BookTicket();
			Bt.BookTickets();
			break;
			case 3:
				CancelTickets Ct = new CancelTickets();
				Ct.CancelTicket();
			
			break;
			case 4:
			BookedTicket Bdt=new BookedTicket();
			Bdt.showTicket();
			break;
		}
		}while(a!=5);
	}
}
class passengerDetails
{
       Scanner scan=new Scanner(System.in);
	   String Origin;
	   String Destination;
	 static   int upper=2;
	 static  int lower=2;
	 static int middle=2;
	 static int totalseat=10;
	 static int Rac=2;
	 static  int wl=2;
	 static String From="Chennai";
	 static String To="Bangalore";
	 static String Date="10/10/2022";
	 static String ATime="6.00A.M";
	 static String DTime="1.00P.M";
		static String Pnr[]=new String[10];
		static String Name[]=new String[10];
		static int Age[]=new int[10];
	    static int Seatno[]=new int[10];
	    static String Gender[]=new String[10];
		static int Fare[]=new int[10];
		static String Berth[]=new String[10];
		int temp =0;
	
}
class BookTicket extends passengerDetails
{
	 static  int pvalue=1;
	 static String pnr;
	 static int count=0;
	 static int seno=1;
	static BookTicket obj=new BookTicket();
	void BookTickets()
	{
		System.out.println("Enter how many ticket you want to book");
		int n=scan.nextInt();
		if(seno<=6)
		{
			pnr=Integer.toString(pvalue);
	    obj.setTicket(n,pnr);
		}
		else if(seno>6 && seno<=8)
		{
			pnr=Integer.toString(pvalue);
			obj.setTicket(n,pnr);
			
		}
		else if(seno>8 && seno<=10)
		{
			pnr="WL";
			obj.setTicket(n,pnr);
		}
		else
			System.out.println("No ticket available");
	}
	void setTicket(int n,String pnr)
	{
			for(int i=0;i<n;i++)
		{
			Pnr[count]=pnr;
			System.out.println("Enter the Passenger Name");
			String na=scan.next();
			Name[count]=na;
			System.out.println("Enter the Passenger Age");
		    int ag=scan.nextInt();
			Age[count]=ag;
			if(ag>5 )
			Seatno[count]=seno++;
		   else 
			   Seatno[count]=0;
			System.out.println("Enter the Passenger Gender");
			String gen=scan.next();
			Gender[count]=gen;
			if(ag>5)
				Fare[count]=400;
			else if( ag>=60 || ag<=5)
				Fare[count]=200;
			boolean check=false;
			if(totalseat>0)
			{
			if(ag>60)
			{
			 check=lower!=0?true:false;
//			 check1=upper!=0?true:false;
			if(check==true)
			{
				Berth[count]="Lower";
				--lower;
				--totalseat;
			}
			else
			{
			System.out.println("No Lower Available");
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
				Berth[count]="no Berth";
			}
			}
			++count;
			
		}
		++pvalue;
		System.out.println("Ticket Booked Sucessfully");
	}
	void berthPreference(int count)
	{
		System.out.println("Enter the Berth Preference as 1.Lower 2.Middle 3.Upper 4.RAC 5.WL");
			int pref=scan.nextInt();
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
		if(lower!=0)
		{
			Berth[count]="Lower";
          --lower;
		}
		else
			obj.upperBerth(count);
	}
     	void upperBerth(int count)
	{
		if(upper!=0)
		{
			Berth[count]="Upper";
		--upper;
		}
		else
			obj.middleBerth(count);
	}	
    void middleBerth(int count)
	{
		if(middle!=0)
		{
			Berth[count]="Middle";
		--middle;
		}
		else
			obj.lowerBerth(count);
	}
    void Rac(int count)
	{
		if(Rac!=0)
		{
			Berth[count]="Rac";
          --Rac;
		}
		else
			obj.WaitingList(count);
	}
    void WaitingList(int count)
	{
		if(wl!=0)
		{
			Berth[count]="Waiting List";
          --wl;
		}
		else
			System.out.println("No Tickets are available");
	}
}

class BookedTicket extends passengerDetails
{
	void showTicket()
	{
		System.out.println("\t\tFrom\t\tTo\t\tDate\t\tArrivaltime\t\tDepartureTime");
		System.out.println("\t\t"+From+"\t\t"+To+"\t"+Date+"\t"+ATime+"\t\t\t"+DTime);
		System.out.print("Pnr\tName\tAge\tSeatno\tGender\tFare\tBerth\n");
		for(int i=0;i<Name.length;i++)
		{	
		if(Fare[i]!=0)
		{
		System.out.print(Pnr[i]+"\t"+Name[i]+"\t"+Age[i]+"\t"+Seatno[i]+"\t"+Gender[i]+"\t"+Fare[i]+"\t"+Berth[i]+"\n");
        }
		}
	}
}

class AvailableTicket extends passengerDetails
{
	void showDetails()
	{
		System.out.println("\t\tFrom\t\tTo\t\tDate\t\tArrivaltime\t\tDepartureTime");
		System.out.println("\t\t"+From+"\t\t"+To+"\t"+Date+"\t"+ATime+"\t\t\t"+DTime);
	 System.out.println("\tNo.of.Lower\tNo.of.Upper\tNo.of.Middle\tRAC\tWaitingList\tTotal seats");
	 System.out.println("\t\t"+lower+"\t\t"+upper+"\t\t"+middle+"\t"+Rac+"\t\t"+wl+"\t\t"+totalseat);
	}
}
class CancelTickets extends passengerDetails{
	void CancelTicket(){
		System.out.print("Welcome to Cancel portal");
		System.out.println("Enter the Delete Seat No:");
		int TicketNo = scan.nextInt();
		if(Pnr[TicketNo-1]!=""){
				System.out.println("Ticket No\tName\tAge\tGender\tBerth\t");
				System.out.println("\t"+Pnr[TicketNo-1]+"\t"+Name[TicketNo-1]+"\t"+Age[TicketNo-1]+"\t"+Gender[TicketNo-1]+"\t"+Berth[TicketNo-1]+"\t");
			}
			System.out.println("1>Cancel");
			int CancelValue = scan.nextInt();
			if(CancelValue == 1){
				Pnr[TicketNo-1]=Pnr[TicketNo];
				Name[TicketNo-1]=Name[TicketNo];
				Age[TicketNo-1]=Age[TicketNo];
				Gender[TicketNo-1]=Gender[TicketNo];
				Berth[TicketNo-1]=Berth[TicketNo];
				Name[TicketNo]=" ";
				Pnr[TicketNo]=" ";
				Age[TicketNo]=0;
				Gender[TicketNo]="";
				Berth[TicketNo]="";
				System.out.println("Ticket No\tName\tAge\tGender\tBerth\t");
				System.out.println("\t"+Pnr[TicketNo]+"\t"+Name[TicketNo]+"\t"+Age[TicketNo]+"\t"+Gender[TicketNo]+"\t"+Berth[TicketNo]+"\t");
				if(TicketNo == 1){
					int i1=5;
					Pnr[TicketNo]=Pnr[TicketNo+i1];
					Name[TicketNo]=Name[TicketNo+i1];
					Age[TicketNo]=Age[TicketNo+i1];
					Gender[TicketNo]=Gender[TicketNo+i1];
					Berth[TicketNo]=Berth[TicketNo+i1];
					System.out.println("Ticket No\tName\tAge\tGender\tBerth\t");
					System.out.println("\t"+Pnr[TicketNo+i1]+"\t"+Name[TicketNo+i1]+"\t"+Age[TicketNo+i1]+"\t"+Gender[TicketNo+i1]+"\t"+Berth[TicketNo+i1]+"\t");
				}
			}
			}
	
}