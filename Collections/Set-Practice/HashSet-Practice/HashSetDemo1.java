import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;
class HashSetDemo1
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
		HashSet<String> hs2 = new HashSet<String>();
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter a name :");
			String name = sc.next();
			hs2.add(name);
		}
		HashSet<String> find = new HashSet<String>();
		for(String s : hs)
			System.out.println(hs2.contains(s)?"yes":"no");
	}
}