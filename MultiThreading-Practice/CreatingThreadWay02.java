public class CreatingThreadWay02
{
}
class Test implements Runnable
{
	public void run()
	{
		System.out.println("Thread is created ");
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		Thread th = new Thread(t);
		th.start();
	}
}