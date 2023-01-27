import java.util.LinkedList;
import java.util.Scanner;
class LinkedListDemo5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> ll1= new LinkedList<Integer>();
		for(int i=0;i<=10;i++)
			ll1.add(i);
		LinkedList<Integer> ll2= new LinkedList<Integer>();
		for(int i=0;i<=10;i++)
			ll2.add(i);
		LinkedList<String> ll3 = new LinkedList<String>();
		for(Integer i : ll1)
			ll3.add(ll2.contains(i)?"Yes":"No");
		System.out.println(ll3);
		System.out.println(ll3.isEmpty());
		ll3.set(1,"10");
		System.out.println(ll3);
	}
}