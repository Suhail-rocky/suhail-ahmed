import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
class ArrayListDemo7
{
	
	public static void main(String[] args)
	{
		String name;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of list-1 :");
		int n1 = sc.nextInt();
		ArrayList<String> list1 = new ArrayList<String>();
		for(int i=0;i<n1;i++)
		{
			name = sc.next();
			list1.add(name);
		}
		ArrayList<String> list2=(ArrayList<String>)list1.clone();
		System.out.println(list2);
		list2.clear();//delete All
		System.out.println(list2.isEmpty());
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		for(int i=0;i<6;i++)
		{
			list3.add(i);
		}
		System.out.println(list3);
		System.out.println(list3.size());
		list3.trimToSize();
		System.out.println(list3);
		System.out.println(list3.size());
		ArrayList<String> c1 = new ArrayList<String>(3);
		c1.add("Suhail");
		c1.add("Ahmed");
		c1.add("Boss");
		System.out.println(c1.size());
		c1.ensureCapacity(6);
		c1.add("Suhail");
		c1.add("Ahmed");
		c1.add("Boss");
		System.out.println(c1.size());
		
		
		
		
	}
}