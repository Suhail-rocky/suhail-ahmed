import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;
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
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		HashSet<String> hs2 =(HashSet<String>)hs.clone();
		System.out.println(hs2);
		ArrayList list = new ArrayList(hs2);
		System.out.println(list);
	}
}