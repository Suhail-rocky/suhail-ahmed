import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map.Entry;
class LinkedHashMapDemo2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String,String> carshowroom = new LinkedHashMap<>(16,0.75f,true);
		System.out.println("Enter a number of cars :");
		int cars =sc.nextInt();
		for(int i=0;i<cars;i++)
		{
			System.out.println("Enter a Car Name : ");
			String cName = sc.next();
			System.out.println("Enter a Car Number :");
			String cNo = sc.next();
			carshowroom.put(cName,cNo);
		}
		System.out.println("Car Show"+carshowroom);
		System.out.println("Enter a Car Name : ");
		String cName = sc.next();
		System.out.println("car corresponding to that number : "+carshowroom.get(cName));
		Iterator<Entry<String,String>> itr = carshowroom.entrySet().iterator();
		while(itr.hasNext())
		{
			Object key = itr.next();
			System.out.println(key);
		}
		Iterator<String> itr2 = carshowroom.keySet().iterator();
		while(itr2.hasNext())
		{
			Object keyView = itr2.next();
			System.out.println(keyView);
		}
		Iterator<String> itr3 = carshowroom.values().iterator();
		while(itr3.hasNext())
		{
			Object valuesView = itr3.next();
			System.out.println(valuesView);
		}
	}
}