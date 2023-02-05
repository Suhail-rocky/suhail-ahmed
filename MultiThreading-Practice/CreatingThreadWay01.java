public class CreatingThreadWay01
{
		
}
class Test extends Thread
{
	public void run()
	{
		System.out.println("Thread is created");
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		t.start();
		
	}
}