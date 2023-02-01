import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map.Entry;
class LinkedHashMapDemo3
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
		// using Lambda forEach method  
		carshowroom.forEach((k,v)-> System.out.println("Car : "+k+", Car Number "+v));
		
	}
}