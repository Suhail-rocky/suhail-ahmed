class SleepDemo3 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println(i+"	"+Thread.currentThread().getName());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args)
	{
		SleepDemo3 s1 = new SleepDemo3();
		s1.start();
		SleepDemo3 s2 = new SleepDemo3();
		s2.start();
		
	}
}