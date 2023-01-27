import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;
class LinkedListDemo4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for(int i=0;i<=10;i++)
		{
			ll.add(i);
		}
		ArrayList<Integer> al = new ArrayList<Integer>(ll);
		System.out.println(ll);
		System.out.println(al);
	}
}
