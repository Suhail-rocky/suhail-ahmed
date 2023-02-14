import java.util.*;
class CompareMethodDemo
{
	public static void main(String[] args)
	{
		String s1="lOVE";
		String s2="love";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}