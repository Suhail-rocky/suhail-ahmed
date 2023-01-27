import java.util.TreeSet;
import java.util.Scanner;
class TreeSetDemo
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		TreeSet<String> set = new TreeSet<String>();
		set.add("red");
		set.add("blue");
		set.add("green");
		set.add("yellow");
		set.add("pink");
		System.out.prinln(set);
	
	}
}