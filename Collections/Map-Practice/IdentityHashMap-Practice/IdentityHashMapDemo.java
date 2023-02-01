import java.util.HashMap;
import java.util.Scanner;
import java.util.IdentityHashMap;
public class IdentityHashMapDemo
{
	//allows duplicates keys and values
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of elements : ");
		int n = sc.nextInt();
		IdentityHashMap<String,String> ihm = new IdentityHashMap<String,String>();
		HashMap<String,String> hm = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name : ");
			String name = sc.next();
			System.out.println("Enter age :");
			String age = sc.next();
			ihm.put(name,age);
			hm.put(name,age);
			
		}
		System.out.println(ihm);
		System.out.println(hm);
	}
}