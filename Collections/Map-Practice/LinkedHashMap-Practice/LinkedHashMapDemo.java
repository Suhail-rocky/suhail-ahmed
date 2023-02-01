import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Iterator;
class LinkedHashMapDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String,String> carshowroom = new LinkedHashMap<>();
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
		System.out.println(carshowroom);
	}
}