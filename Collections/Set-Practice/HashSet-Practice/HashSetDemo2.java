import java.util.HashSet;
import java.util.Scanner;
class HashSetDemo2
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();
		HashSet<String> set1 = new HashSet<String>();
		set.add("suhail");
		set.add("karthick");
		set.add("Rajesh");
		set.add("Abdur");
		set1.add("suhail");
		set1.add("karthick");
		set1.add("jameel");
		set1.add("Anas");
		//set.removeAll(set1);
		System.out.println(set);
		set.retainAll(set1);
		System.out.println(set);
		
		
	}
}