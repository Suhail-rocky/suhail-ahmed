import java.util.*;
public class Test6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of elements :");
		int n = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a number :");
			int no = sc.nextInt();
			list.add(no);
		}
		System.out.println("Enter a number to rotate :");
		int k = sc.nextInt();
		for(int i=k;i<n;i++)
		{
			System.out.print(list.get(i)+" ");
		}
		for(int i=0;i<k;i++)
		{
			System.out.print(list.get(i)+" ");
		}
		//System.out.println(list);
	}
}