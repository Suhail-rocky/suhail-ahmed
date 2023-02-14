class BookTheatre
{
	int total_Seats=10;
	public void bookSeats(int seat)
	{
		if(total_Seats >= seat)
		{
			total_Seats=total_Seats-seat;
			System.out.println("seat left : "+total_Seats);
		}
		else
		{
			System.out.println("Tickets cannot booked ");
			System.out.println("seat left : "+total_Seats);
		}
	}

}
public class MovieApp extends Thread
{ 
	static BookTheatre b;
	int seats;
	public void run()
	{
		b.bookSeats(seats);
	}
	public static void main(String[] args)
	{
		b=new BookTheatre();
		MovieApp suhail = new MovieApp();
		suhail.seats=7;
		suhail.start();
		MovieApp Ahmed = new MovieApp();
		Ahmed.seats=6;
		Ahmed.start();
		
		
		
	}
}