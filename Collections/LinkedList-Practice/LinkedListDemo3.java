import java.util.LinkedList;
import java.util.Scanner;
class LinkedListDemo3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of List :");
		int n = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=0;i<n;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		Object o =list.peekFirst();
		System.out.println(o);
		Object ol =list.peekLast();
		System.out.println(ol);
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		LinkedList<String> list3 = new LinkedList<String>();
		if(list.contains(1))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	
	}
}