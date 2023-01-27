import java.util.Scanner;
import java.util.ArrayList;
class Lift1
{
	ArrayList<String> lift = new ArrayList<String>();
	ArrayList<Integer> liftno = new ArrayList<Integer>();
	public static void main(String[] args)
	{
		Lift1 l1 = new Lift1();
		l1.lift();
		l1.view();
		
	}
	public void lift()
	{
		System.out.println("Enter a how many lifts :");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			lift.add("L"+i);
			liftno.add(0);
		}
	}
	public void view()
	{
		for(int i=0;i<lift.size();i++)
		{
			System.out.print(lift.get(i)+" ");
		}
		System.out.println();
		for(int i=0;i<liftno.size();i++)
		{
			System.out.print(liftno.get(i)+" ");
		}
	}
	public void nearestLift()
	{
		
	}
}