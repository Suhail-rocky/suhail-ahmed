
import java.util.*;
public class Railway{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to Railway Reaservation");
	Reservation r = new Reservation();
	
	while(true) {
	System.out.println("Enter 1.Available Tickets 2.Book Tickets 3.Cancel Tickets 4.Booked Tickets 5.Exit");
	int userChoice = sc.nextInt();
	switch(userChoice){
	case 1:
	r.availableTickets();
	break;
	case 2:
	r.BookingTickets();
	break;
	case 3:
	r.CanceTicket();
	break;
	case 4:
	r.BookedTickets();
	break;
	case 5:
	System.exit(0);
	break;
	default:
	System.out.println("Try again");
	}}
	}
	}
	
 class Reservation extends Railway{
	static Scanner sc = new Scanner(System.in);
	int pnrID=0;
	static int Ticket_No[] = new int[10];
	static String Passenger_Name[] = new String[10];
	static int Passenger_Age[] = new int[10];
	static String Gender[] = new String[10];
	static int Berth[] = new int[10];
	static int fare = 400;
	static int k=0,total,i,j;
	static int lb=2,ub=2,rac=2,wl=2,mb=2;
	public void BookingTickets(){
	lb=0;mb=0;ub=0;rac=0;wl=0;
	System.out.println("Enter the Number of tickets if you want to book ");
	total = sc.nextInt();
	for(i=0;i<total;i++) {
	System.out.println("Enter the Ticket No ");
	Ticket_No[k]=sc.nextInt();
	System.out.println("Enter Your name : ");
	Passenger_Name[k] = sc.next();
	System.out.println("Enter your Age :");
	Passenger_Age[k] = sc.nextInt();
	System.out.println("Enter Your Gender :");
	Gender[k] = sc.next();
	System.out.println("Enter your Berth :  1.Lower 2.Middle 3.Upper 4.RAC 5.Waiting List");
	Berth[k] = sc.nextInt();
	if(Berth[k] == 1)
	lb++;
	else if(Berth[k] == 2)
	mb++;
	else if(Berth[k] == 3)
	ub++;
	else if(Berth[k] == 4)
	rac++;
	else {
	wl++;
	}
	k++;
	System.out.println((i+1)+"Ticket booked SucessFully ");
}
	pnrID++;
}
	public  void BookedTickets(){
		//Book ViewBook = new Book();
		System.out.println("Welcome to Booked Tickets");
		System.out.println("Ticket No\tName\tAge\tGender\tBerth\tPNRID");
		for(j=0;j<Passenger_Name.length;j++){
			if(Passenger_Age[j]!=0){
				
				System.out.println(Ticket_No[j]+"\t"+Passenger_Name[j]+"\t"+Passenger_Age[j]+"\t"+Gender[j]+ "\t"+Berth[j]+"\t"+pnrID);
			}
		}
			
	}
	public  void CanceTicket() {
		System.out.print("Welcome to Cancel portal");
		System.out.println("Enter the Delete Ticket No:");
		int TicketNo = sc.nextInt();
		if(Ticket_No[TicketNo-1]!=0){
				System.out.println("Ticket No\tName\tAge\tGender\tBerth\tPNRID");
				System.out.println("\t"+Ticket_No[TicketNo-1]+"\t"+Passenger_Name[TicketNo-1]+"\t"+Passenger_Age[TicketNo-1]+"\t"+Gender[TicketNo-1]+"\t"+Berth[TicketNo-1]+"\t"+pnrID);
			}
			System.out.println("1>Cancel");
			int CancelValue = sc.nextInt();
			if(CancelValue == 1){
				Ticket_No[TicketNo-1]=Ticket_No[TicketNo];
				Passenger_Name[TicketNo-1]=Passenger_Name[TicketNo];
				Passenger_Age[TicketNo-1]=Passenger_Age[TicketNo];
				Gender[TicketNo-1]=Gender[TicketNo];
				Berth[TicketNo-1]=Berth[TicketNo-1];
				Passenger_Name[TicketNo]="0";
				Ticket_No[TicketNo]=0;
				Passenger_Age[TicketNo]=0;
				Gender[TicketNo]="0";
				Berth[TicketNo-1]=0;
			}
	}
	public void availableTickets() {
		System.out.println("The Number of tickets available are : ");
		System.out.println("Welcome to Available Tickets");
		System.out.println("10 confirmed Tickets");
		System.out.println("Lower berth - 2");
		System.out.println("Middle berth - 2");
		System.out.println("upper berth - 2");
		System.out.println("RAC - 2");
		System.out.println("Waiting List - 2");
		System.out.println("Ticket No\tName\tAge\tGender\tBerth\tPNRID");
		for(i=0;i<Passenger_Name.length;i++) {
			System.out.println(Ticket_No[i]+"\t"+Passenger_Name[i]+"\t"+Passenger_Age[i]+"\t"+Gender[i]+ "\t"+Berth[i]+"\t"+pnrID);

		}
	}
}
			
	
