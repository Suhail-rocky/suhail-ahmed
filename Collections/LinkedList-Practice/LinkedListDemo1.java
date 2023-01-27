import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ListIterator;
class LinkedListDemo1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of  List :");
		int n = sc.nextInt();
		LinkedList<String> ll = new LinkedList<String>();
		for(int i=0;i<n;i++)
		{
			ll.add(i+"");
		}
		Iterator itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		Iterator it =ll.descendingIterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		ll.add(1,"Suhail");
		System.out.println(ll);
		ll.addFirst("Suhail");
		ll.addLast("Ahmed");
		System.out.println(ll);
		System.out.println(ll.indexOf("Suhail"));
		System.out.println(ll.lastIndexOf("Suhail"));
		for(int i=0;i<ll.size();i++)
			System.out.print(ll.get(i)+" ");
		ll.remove("Suhail");
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		ll.clear();
		System.out.println(ll);
		
		
		
		
	}
}