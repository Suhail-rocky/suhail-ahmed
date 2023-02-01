import java.util.*;

class RailwayOperations{
	Scanner in = new Scanner(System.in);
	static ArrayList<String>rac = new ArrayList<String>();
	static ArrayList<String>books = new ArrayList<String>(); //For booking history
	static ArrayList<String>wait = new ArrayList<String>(); //For Waiting history
	static ArrayList<String>berthname = new ArrayList<String>(); 
	static int seatno=0,pnr=457890,berth=63,avlbl=72,wl=10,racc=18,racberth=9,w=0,bookingnum=0,ub=21,mb=21,lb=21;
	String bt;
	String sts;
	int i;
	void booking(){ // Booking module
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the count of passengers : ");
		int c = in.nextInt();in.nextLine();
		for(int k=1;k<=c;k++){
		bookingnum++;
		seatno++;
		System.out.println("Enter your name : ");
		String name = in.nextLine();
		System.out.println("Enter your Gender : ");
		String gender = in.nextLine();
		System.out.println("Enter your age : ");
		String age = in.nextLine();
		int ag = Integer.parseInt(age);
		if(ag>60){ 
		System.out.println("As per norms, Lower Berth is only, because you are too old.");
		
		if(lb>0) {
			System.out.println("Lower Berth available ! Allocated");
			bt = "LB";
			lb--;
			berth--;
			berthname.add(bt);
		}
		
		}else if(ag<=5) {
			bt="LB";
			lb--;
			berth--;
		}else {
		System.out.println("Choose your Berth : LB/UB/MB ");
		bt = in.nextLine();
		if(bt.equals("LB") && lb>0) {
			bt = "LB";
			lb--;
			berth--;
			berthname.add(bt);
		}else if(bt.equals("UB") && ub>0) {
			bt = "UB";
			ub--;
			berth--;
			berthname.add(bt);
		}else {
			bt="MB";
			mb--;
			berth--;
			berthname.add(bt);
		}
		
		}
		avlbl--;//for making waitlist
		if(avlbl>0 && berth>0){
		books.add(seatno +"  "+ pnr+"\t"+"\t"+name+"\t"+age+"\t"+gender+"\t"+ bt +"\n");
		}
		else if(avlbl<=0){
			racc--;
			books.add(seatno +"  "+ pnr+"\t"+"\t"+name+"\t"+age+"\t"+gender+"\t"+ bt +"\n");
			rac.add(seatno +"  "+ pnr+"\t"+"\t"+name+"\t"+age+"\t"+gender+"\t"+ bt +"\n");
		}else if(avlbl<=0 && racc<=0){
			if(wl>0) {
			wait.add(pnr + "\t" + "WL : "+ ++w  + "\t" + name + "\t" + age + "\n");
			wl--;
		}
		}	
		}
		pnr++;//except bulk bookings it will run
		}

	void cancel(){ //cancellation
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the pnr : ");
		String pnr = in.nextLine();
		int tc=0;
		String seat = null;
		for(int i=0;i<books.size();i++){
		if(books.get(i).contains(pnr)){
		tc++;
		}
		}
		
		if(tc>1) {
			System.out.println("Enter the seatno : ");
			seat = in.nextLine();
			String bh;
			int ref = 0;
			for(int i=0;i<books.size();i++){
				if(books.get(i).contains(seat)){
					if(books.get(i).contains("UB")) {
						ub++;
					}else {
						lb++;
					}
				books.remove(i);
				ref=i;
				berth++;
				bookingnum--;
				}
				}
		}else {
			for(int i=0;i<books.size();i++){
				if(books.get(i).contains(pnr)){
					books.remove(i);
				}
				}
		}
		/*
		 * books.add(wait.get(0) + "Confirmed"); wait.remove(0); wl++;
		 */
		
		//books.add(seat + "\t" + rac.get(0));

		}	
	
	void availability() {
		System.out.println("Seats booked : " + bookingnum);
		System.out.println("Berth Available : " + berth);
		System.out.println("Lower Berth : " + lb + " Upper Berth : " + ub + " Middle Berth : " + mb);
		System.out.println("Waiting list : " + wl);
		System.out.println("RAC" + racc);
	}
}

public class Railway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int op;
		do {
			System.out.println("Zoho Railway Reservation System");
			System.out.println("1.Book Ticket 2.Cancel Ticket 3.Print Bookings 4.Print Availability");
			op = in.nextInt();in.nextLine();
			switch(op) {
			case 1 : RailwayOperations r = new RailwayOperations();
					 r.booking();
					 break;
					 
			case 2 : RailwayOperations r2 = new RailwayOperations();  
					 r2.cancel();
					 break;
					 
			case 3 : RailwayOperations r1 = new RailwayOperations();
					 System.out.print( r1.books );
					 break;
			case 4 : RailwayOperations r3 = new RailwayOperations();
			 		 r3.availability();
			 		 
			 break;
			
			}
			
		}while(op<=4);
	}

}
