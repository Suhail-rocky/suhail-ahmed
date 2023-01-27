import java.util.*;
class ArrayListDemo8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of list :");
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			list.add(""+i);
		}
		System.out.println("Enter a element to replace :");
		list.set(1,""+10);
		System.out.println(list);
	}
}