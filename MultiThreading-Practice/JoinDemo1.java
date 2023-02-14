public class JoinDemo1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				Thread.sleep(1000);
				System.out.println("Child Thread	"+i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		JoinDemo1 jd = new JoinDemo1();
		jd.start();
		
		try
		{
			jd.join();
			for(int i=1;i<=5;i++)
			{
				Thread.sleep(1000);
				System.out.println("Main Thread	"+i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
}