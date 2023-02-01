import java.util.Iterator;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
class MapDemo5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of students : ");
		int n = sc.nextInt();
		Map<Integer,String> sd = new LinkedHashMap<>();
		int rollno=1001;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a name : ");
			String name = sc.next();
			sd.put(i+rollno,name);
		}
		for(Integer rollnos : sd.keySet())
			System.out.println("Roll no :"+rollnos);
		for(String Name : sd.values())
			System.out.println("name :"+Name);
		for(Map.Entry<Integer,String> entry : sd.entrySet())
		{
			System.out.println("Roll No :"+entry.getKey()+"Name : "+entry.getValue());
		}
	
	}
}