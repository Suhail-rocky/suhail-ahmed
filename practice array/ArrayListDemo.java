import java.util.*;
public class ArrayListDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("How many elements you want to add ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		arr.add(i);
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		System.out.println("How many elements you want to add ");
		n = sc.nextInt();
		for(int i=1;i<=n;i++)
		arr1.add(i);
		System.out.println(arr);
		System.out.println(arr1);
		ArrayList<String> compare = new ArrayList<String>();
		for(int i:arr)
			compare.add(arr1.contains(i)?"True":"False");
		System.out.println(compare);
	}
}