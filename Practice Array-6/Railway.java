import java.util.*;
public class Railway{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("\t\t\tWelcome to Railway Reservation");
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
	case 3:set ss
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
	}
	}
	}
	}
	
 class Reservation extends Railway{
	static Scanner sc = new Scanner(System.in);
	static int pnrID=0;
	static int Ticket_No[] = new int[10];
	static String Passenger_Name[] = new String[10];
	static int Passenger_Age[] = new int[10];
	static String Gender[] = new String[10];
	static int Berth[] = new int[10];
	static String Berth1[] = new String[10];
	static int fare = 400;
	static int k=0,total,i,j;
	static int lb=2,ub=2,rac=2,wl=2,mb=2;
	public void BookingTickets(){
	lb=0;mb=0;ub=0;rac=0;wl=0;
	System.out.println("Enter the Number of tickets if you want to book ");
	total = sc.nextInt();
	for(i=0;i<total;i++) {
	System.out.println("Enter the Ticket Serial No ");
	Ticket_No[k]=sc.nextInt();
	System.out.println("Enter Your name : ");
	Passenger_Name[k] = sc.next();
	System.out.println("Enter your Age :");
	Passenger_Age[k] = sc.nextInt();
	if(Passenger_Age[k] >= 60 || Passenger_Age[k] <= 5) {
		fare = 200;
	}
	System.out.println("Enter Your Gender :");
	Gender[k] = sc.next();
	System.out.println("Enter your Berth :  L as Lower ||  M as Middle ||U as Upper || RAC || WL as Waiting List");
	Berth1[k] = sc.next();
	if(Berth1[k] == "L") {
	lb++;
	if(lb == 3)
		System.out.println("LowerBirth is Full");
	}
	else if(Berth1[k] == "M") {
	mb++;
	if(mb == 3)
		System.out.println("MiddleBirth is Full");
	}
	else if(Berth1[k] == "U") {
	ub++;
	if(ub == 3)
		System.out.println("UpperBirth is Full");
	}
	else if(Berth1[k] == "RAC") {
	rac++;
	if(rac == 3)
		System.out.println("RAC is full");
	}
	else {
	wl++;
	if(wl == 3)
		System.out.println("No Tickets are available");
		
	}
	k++;
	System.out.println((i+1)+"Ticket booked SucessFully ");
}
	pnrID++;
}
	public  void BookedTickets(){
		//Book ViewBook = new Book();
		System.out.println("Welcome to Booked Tickets");
		System.out.println("\tTicket No\tName\tAge\tGender\tBerth\tPNRID\tFare");
		for(j=0;j<Passenger_Name.length;j++){
			if(Passenger_Age[j]!=0){
				
				System.out.println("\t"+Ticket_No[j]+"\t\t"+Passenger_Name[j]+"\t"+Passenger_Age[j]+"\t"+Gender[j]+ "\t"+Berth1[j]+"\t"+pnrID+"\t"+fare);
			}
		}
			
	}
	public  void CanceTicket() {
		System.out.print("Welcome to Cancel portal");
		System.out.println("Enter the Delete Ticket No:");
		int TicketNo = sc.nextInt();
		if(Ticket_No[TicketNo-1]!=0){
				System.out.println("Ticket No\tName\tAge\tGender\tBerth\tPNRID");
				System.out.println("\t"+Ticket_No[TicketNo-1]+"\t"+Passenger_Name[TicketNo-1]+"\t"+Passenger_Age[TicketNo-1]+"\t"+Gender[TicketNo-1]+"\t"+Berth1[TicketNo-1]+"\t"+pnrID);
			}
			System.out.println("1>Cancel");
			int CancelValue = sc.nextInt();
			if(CancelValue == 1){
				Ticket_No[TicketNo-1]=Ticket_No[TicketNo];
				Passenger_Name[TicketNo-1]=Passenger_Name[TicketNo];
				Passenger_Age[TicketNo-1]=Passenger_Age[TicketNo];
				Gender[TicketNo-1]=Gender[TicketNo];
				Berth[TicketNo-1]=Berth[TicketNo-1];
				Passenger_Name[TicketNo]="";
				Ticket_No[TicketNo]=0;
				Passenger_Age[TicketNo]=0;
				Gender[TicketNo]="";
				Berth[TicketNo-1]=0;
			}
	}
	public static void availableTickets() {
		System.out.println("The Number of tickets available are : ");
		System.out.println("Welcome to Available Tickets");
		System.out.println("10 confirmed Tickets");
		System.out.println("Lower berth - 2");
		System.out.println("Middle berth - 2");
		System.out.println("upper berth - 2");
		System.out.println("RAC - 2");
		System.out.println("Waiting List - 2");
		System.out.println("\tTicket No\tName\tAge\tGender\tBerth\tPNRID");
		for(i=0;i<Passenger_Name.length;i++) {
			Berth1[0]="L";
			Berth1[1]="L";
			Berth1[2]="M";
			Berth1[3]="M";
			Berth1[4]="U";
			Berth1[5]="U";
			Berth1[6]="RAC";
			Berth1[7]="RAC";
			Berth1[8]="WL";
			Berth1[9]="WL";
			System.out.println("\t\t"+Ticket_No[i]+"\t"+Passenger_Name[i]+"\t"+Passenger_Age[i]+"\t"+Gender[i]+ "\t"+Berth1[i]+"\t"+pnrID);
		}
	}
		
	}
 
			
	