class Zoho
{
	static int count=1;
	public static synchronized void clearInterview()
	{
		System.out.println("Zoho clear interview  level-"+count);
		count++;
	}
}
class Level1 extends Thread
{
	Zoho z=new Zoho();
	public void run()
	{
		z.clearInterview();
	}
}
class Level2 extends Thread
{
	Zoho z=new Zoho();
	public void run()
	{
		z.clearInterview();
	}
}
class Level3 extends Thread
{
	Zoho z=new Zoho();
	public void run()
	{
		z.clearInterview();
	}
}
public class StaticSynchronizedDemo
{
	public static void main(String[] args)
	{
		Level1 l1 = new Level1();
		l1.start();
		Level2 l2 = new Level2();
		l2.start();
		Level3 l3= new Level3();
		l3.start();
	}
}