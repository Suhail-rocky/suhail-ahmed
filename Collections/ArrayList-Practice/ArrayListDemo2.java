import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;
class ArrayListDemo2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of list :");
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a list");
			String name = sc.next();
			list.add(name);
		}
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Enter the element to remove :");
		int r = sc.nextInt();
		list.remove(r);//delete
		for(String s:list)
			System.out.println(s);
		System.out.println("Enter the element to Saerch :");
		String search = sc.next();
		System.out.println(list.contains(search));
		Collections.sort(list);
		System.out.println(list);
		ArrayList<String> list1 = new ArrayList<String>(list);
		System.out.println(list1);
	}
}