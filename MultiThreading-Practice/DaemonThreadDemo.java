class DaemonThreadDemo extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("Daemon Thread");
	}
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("main Thread");
		DaemonThreadDemo dt = new DaemonThreadDemo();
		dt.setDaemon(true);
		dt.start();
	}
}