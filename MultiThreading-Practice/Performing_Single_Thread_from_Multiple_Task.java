public class Performing_Single_Thread_from_Multiple_Task
{
}
class Test extends Thread
{	
	public void run()
	{
		System.out.println("thread task");
	}
	public static void main(String[] args)
	{
		Test t1 = new Test();
		t1.start();
		Test t2 = new Test();
		t2.start();
	}
}