import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
class ArrayListDemo4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of list :");
		int n = sc.nextInt();
		List<String> list = new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			String name = sc.next();
			list.add(name);
		}
		System.out.println(list);
		System.out.println("Enter a portion to be extracted :");
		int from=sc.nextInt();
		int to=sc.nextInt();
		List<String> subList = list.subList(from,to);
		System.out.println(subList);
	}
}