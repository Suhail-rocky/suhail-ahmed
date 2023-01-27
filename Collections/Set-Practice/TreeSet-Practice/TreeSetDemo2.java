import java.util.TreeSet;
import java.util.Scanner;
class TreeSetDemo2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("A");
		set1.add("C");
		set1.add("B");
		set1.add("M");
		set1.add("Z");
		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("A");
		set2.add("C");
		set2.add("B");
		set2.add("M");
		set2.add("Z");
		for(String s:set1)
			System.out.println(set2.contains(s)?"Yes":"no");
		
	}
}