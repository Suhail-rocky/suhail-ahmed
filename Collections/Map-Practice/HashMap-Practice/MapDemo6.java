import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
class MapDemo6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of country :");
		int n = sc.nextInt();
		Map<String,String> country = new TreeMap<>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a Country name :");
			String countryName = sc.next();
			System.out.println("Enter a Country Capital Name : ");
			String capitalName=sc.next();
			country.put(countryName,capitalName);
		}
		country.forEach((k,v)->System.out.println("Country :"+k+"Capital "+v));
	}
}