public class PriorityInThread extends Thread
{
	public void run()
	{
		System.out.println("Child thread Priority "+Thread.currentThread().getPriority());
		System.out.println("Child Thread");
	}
	public static void main(String[] args)
	{
		PriorityInThread p = new PriorityInThread();
		System.out.println("Main Old Priority "+Thread.currentThread().getPriority());
		p.start();
		Thread.currentThread().setPriority(6);
		System.out.println("Main new Priority "+Thread.currentThread().getPriority());
		
	}
}