class Practice extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("Thread Task");
		Thread.currentThread().setName("Ahmed");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args)
	{
		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Suhail");
		System.out.println(Thread.currentThread().getName());
		//System.out.println(10/0);
		Practice p = new Practice();
		p.start();
		
	}
}