import java.util.TreeSet;
import java.util.Scanner;
import java.util.Iterator;
class TreeSetDemo
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		TreeSet<String> set = new TreeSet<String>();
		set.add("red");
		set.add("blue");
		set.add("green");
		set.add("yellow");
		set.add("pink");
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		TreeSet<String> set1 =new TreeSet<String>();
		set1.addAll(set);
		Object first_element = set1.first();
		System.out.println("First element is "+first_element);
		Object last_element=set1.last();
		System.out.println("Last Element is"+last_element);
		System.out.println(set1);
		Iterator itrev = set1.descendingIterator();
		while(itrev.hasNext())
		{
			System.out.println(itrev.next());
		}
		TreeSet<String> c=(TreeSet<String>)set.clone();
		System.out.println(c);
		System.out.println(c.size());
		
	
	}
}