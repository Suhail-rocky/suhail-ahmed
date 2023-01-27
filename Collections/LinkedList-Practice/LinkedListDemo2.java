import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
class LinkedListDemo2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of list ");
		int n = sc.nextInt();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for(int i=0;i<n;i++)
		{
			ll.add(i);
		}
		System.out.println(ll);
		Collections.swap(ll,0,2);
		System.out.println(ll);
		Collections.shuffle(ll);
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		System.out.println(ll);
		ll2.addAll(ll);
		System.out.println(ll2);
		LinkedList<Integer> ll3=(LinkedList<Integer>)ll2.clone();
		System.out.println(ll3);
		
	}
}