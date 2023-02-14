public class InterruptedDemo2 extends Thread
{
	public void run()
	{
		//System.out.println(Thread.interrupted());
		System.out.println(Thread.currentThread().isInterrupted());
		try
		{
			for(int i=1;i<=5;i++)
			{	
				System.out.println(i);
				Thread.sleep(1000);
				System.out.println(Thread.interrupted());
			}
				
		}
		catch(Exception e)
		{
			System.out.println("Thread Interrupted "+e);
		}
	}
	public static void main(String[] args)
	{
		InterruptedDemo2 id = new InterruptedDemo2();
		id.start();
		id.interrupt();	
	}
}

