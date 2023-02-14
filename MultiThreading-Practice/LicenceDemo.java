public class LicenceDemo
{
	public static void main(String[] args) throws Exception
	{
		Medical med = new Medical();
		med.start();
		med.join();
		TestDrive td = new TestDrive();
		td.start();
		td.join();
		OfficerChecked oc = new OfficerChecked();
		oc.start();
		oc.join();
		
	}
}
class Medical extends Thread
{
	public void run()
	{
		try{
		System.out.println("Medical Officer checking ");
		Thread.sleep(1000);
		System.out.println("Medical Officer Checked");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class TestDrive extends Thread
{	
	public void run() {
		try
		{
		System.out.println("TestDrive Officer checking ");
		Thread.sleep(1000);
		System.out.println("TestDrive Officer Checked");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class OfficerChecked extends Thread
{
	public void run() 
	{
		try
		{
			System.out.println("OfficerChecked Officer checking ");
			Thread.sleep(1000);
			System.out.println("OfficerChecked Officer Checked");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}