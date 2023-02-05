public class Performing_Multiple_Task_From_Multiple_Thread
{
}
class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread1");
	}
}
class Thread2 extends Thread
{	
	public void run()
	{
		System.out.println("Thread2");
	}
}
class Main
{
	public static void main(String[] args)
	{
		Thread1 t1 = new Thread1();
		t1.start();
		Thread2 t2 = new Thread2();
		t2.start();
	}

}