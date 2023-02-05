public class Performing_Single_Thread_from_Single_Task
{

}
class Test extends Thread
{
	public void run()
	{
		System.out.println("Thread task");
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		t.start();
	}
}