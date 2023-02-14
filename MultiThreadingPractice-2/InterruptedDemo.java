public class InterruptedDemo extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);// If Thread.sleep() is not there it works normally else it throws Interrupted Exception
			}
		}
		catch(Exception e)
		{
			System.out.println("Thread Interrupted : - "+e);
		}
	}
	public static void main(String[] args)
	{
		InterruptedDemo id = new InterruptedDemo();
		id.start();
		id.interrupt();
		
		
	}
}	