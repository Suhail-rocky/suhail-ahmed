import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
class HashSetDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		HashSet<String> hs = new HashSet<String>();
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter a name :");
			String name = sc.next();
			hs.add(name);
		}
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}
}