import java.util.*;
public class SwapArrayList
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter a no of arrayList:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.addAll(list);
		System.out.println(list1);
		Collections.swap(list,1,2);
		System.out.println(list);
		list.clear();
		System.out.println(list.isEmpty());
		
			
	}
}