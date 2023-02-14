class TicketBook
{
	int total_Seats=10;
	public synchronized void bookSeats(int seats)
	{
		if(total_Seats >= seats)
		{
			System.out.println("Seats booked Sucessfully");
			total_Seats = total_Seats -seats;
			System.out.println("seat left	: "+total_Seats);
		}
		else
		{
			System.out.println("Seats cannot be booked ");
			System.out.println("seat left	: "+total_Seats);
		}
	}
}
class MovieAppDemo extends Thread
{	
	static TicketBook b;
	int seats;
	
	public void run()
	{	
		b.bookSeats(seats);
	}
	public static void main(String[] args)
	{
		b=new TicketBook();
		MovieAppDemo suhail = new MovieAppDemo();
		suhail.seats=4;
		suhail.start();
		MovieAppDemo ahmed = new MovieAppDemo();
		ahmed.seats=3;
		ahmed.start();
	}
}