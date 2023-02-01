import java.util.Iterator;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
class MapDemo4
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
		Iterator<Integer> itrKeys =sd.keySet().iterator();
		Iterator itrValues = sd.values().iterator();
		System.out.println("rollno"+"\t"+"name");
		while(itrKeys.hasNext() && itrValues.hasNext())
		{
			System.out.println(itrKeys.next()+"\t"+itrValues.next());
		}
	}
}