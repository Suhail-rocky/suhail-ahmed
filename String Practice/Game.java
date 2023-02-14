class Game extends Thread
{
	public void run()
	{
		System.out.println("Thread is created");
	}
	public static void main(String[] args)
	{
		
		Game g = new Game();
		g.start();
		
		if(g.isAlive())
		{
			System.out.println("still Alive");
			g.start();
		}
		else
		{
			System.out.println("is dead");
			
		}
	}
	
}