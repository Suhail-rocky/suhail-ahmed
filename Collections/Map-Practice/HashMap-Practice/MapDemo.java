import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
class MapDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Map<Integer,String> map = new HashMap<>();
		// check is map is entry
		boolean isEmpty=map.isEmpty();
		System.out.println("Is Map is Empty : "+isEmpty);
		System.out.println("Enter a how many details : ");
		int n = sc.nextInt();
		int x=1001;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a Student name :");
			String name = sc.next();
			map.put(i+x,name);
			x++;
		}
		int size = map.size();
		System.out.println(size);
		System.out.print(map);
		System.out.println("Roll no\tName ");
		for(int i=0;i<n;i++)
		{
			System.out.print(map.get(i)+" ");
		}
		Map<Integer,String> map2 = new HashMap<>();
		System.out.println("Enter a how many details : ");
		n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a Student name :");
			String name = sc.next();
			map2.put(i+x,name);
			x++;
		}
		
		System.out.println(map2);
		map.putAll(map2);
		System.out.println(map);
		map.remove(1001,"suhail");
		System.out.print(map);
		map.clear();
		System.out.println("Is Map is Empty : "+isEmpty);
		
		
	}
}