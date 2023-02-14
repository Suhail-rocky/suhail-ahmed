public class JoinDemo2 extends Thread
{
	static Thread mainthread;
	public void run()
	{
		try
		{
			mainthread.join();
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
		mainthread=Thread.currentThread();
		JoinDemo2 jd = new JoinDemo2();
		jd.start();
		
		
		try
		{
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