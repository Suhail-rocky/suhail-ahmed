public class YieldDemo extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"	"+i);
		}
	}
	public static void main(String[] args)
	{
		YieldDemo yd = new YieldDemo();
		yd.start();
		Thread.yield();//for stop the main thread and executing the YieldDemo thread
		System.out.println("main Thread");
	}
}