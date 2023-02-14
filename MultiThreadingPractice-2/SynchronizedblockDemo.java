class Sender
{
	public void senderMsg(String msg)
	{
		System.out.println("Sending a message : "+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Thread interrupted ");
		}
		System.out.println("\n"+msg);
	}
}
class SenderDemo extends Thread
{
	private String msg;
	Sender sd;
	SenderDemo(String m,Sender obj)
	{
		msg = m;
		sd = obj;
	}
	public void run()
	{
		synchronized(sd)
		{
			sd.senderMsg(msg);
		}
	}
}
class SynchronizedblockDemo
{
	public static void main(String[] args)
	{
		Sender s = new Sender();
		SenderDemo sd1 = new SenderDemo("Assalamu Alaikum",s);	
		SenderDemo sd2 = new SenderDemo("Walaikum Assalam",s);
		sd1.start();
		sd2.start();
		try
		{
			sd1.join();
			sd2.join();
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
		}
	}
}