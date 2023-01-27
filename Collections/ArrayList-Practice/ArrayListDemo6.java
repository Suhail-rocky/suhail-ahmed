import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
class ArrayListDemo6
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
		System.out.println("which elements you want to swap :");
		int from=sc.nextInt();
		int to=sc.nextInt();
	//	Collections.swap(list1,from,to);//swap ArrayList
		System.out.println(list1);
		ArrayList list2 = new ArrayList();
		list1.addAll(list2);//join two arrayList
		System.out.println(list2);
		
	}
}