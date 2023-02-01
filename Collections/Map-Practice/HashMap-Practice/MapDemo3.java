import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
class MapDemo3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Map<Integer,String> Students = new LinkedHashMap<>();
		System.out.println("Enter a number of Students :");
		int details=sc.nextInt();
		int rollno=1001;
		//add
		for(int i=0;i<details;i++)
		{
			System.out.println("Enter a name : ");
			String name = sc.next();
			Students.put(i+rollno,name);
		}
		//view
		Iterator<Entry<Integer,String>> itr = Students.entrySet().iterator();
		//way-1
		System.out.println("Iterating map keys : ");
		while(itr.hasNext())
		{
			Object key = itr.next();
			System.out.println(key);
		}
		//way-2
		Iterator<Integer> itr2 = Students.keySet().iterator();
		System.out.println("Iterating Keys of Map");
		while(itr2.hasNext())
		{
			Object keyView = itr2.next();
			System.out.println(keyView);
		}
		//ways-3
		Iterator<String> itr3=Students.values().iterator();
		System.out.println("Iterating values of Map");
		while(itr3.hasNext())
		{
			Object valuesView = itr3.next();
			System.out.println(valuesView);
		}
		
		
	}
}
