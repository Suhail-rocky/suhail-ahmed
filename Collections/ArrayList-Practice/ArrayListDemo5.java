import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
class ArrayListDemo5
{
	
	public static void main(String[] args)
	{
		String name;
	int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of list-1 :");
		int n1 = sc.nextInt();
		List<String> list1 = new ArrayList<String>();
		for(int i=0;i<n1;i++)
		{
			name = sc.next();
			list1.add(name);
		}
		System.out.println("Enter a no of list-2 :");
		int n2= sc.nextInt();
		List<String> list2 = new ArrayList<String>();
		for(int i=0;i<n2;i++)
		{
			name = sc.next();
			list2.add(name);
		}
		List list3 = new ArrayList();
		if(n1 > n2 )
			temp=n1;
		else
			temp=n2;
		for(int i=0;i<temp;i++)
		{
			list3.add(list2.contains(list1)?"yes":"No");
		}
		for(Object o:list3)
		{
			System.out.println(o);
		}
		System.out.println("which elements you want to swap :");
		int from=sc.nextInt();
		int to=sc.nextInt();
		Collections.swap(list1,from,to);//swap ArrayList
		System.out.println(list1);
	}
}
		