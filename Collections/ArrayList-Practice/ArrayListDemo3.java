import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
class ArrayListDemo3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of list :");
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			String name = sc.next();
			list.add(name);
		}
		System.out.println(list);
		Collections.shuffle(list);//shuffle
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}	
}
