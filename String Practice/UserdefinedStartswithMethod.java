import java.util.Scanner;
class UserdefinedStartswithMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String-1");
		String s1=sc.next();
		System.out.println("Enter a first letter to find : ");
		String first=sc.next();
		System.out.println("Enter a String-2");
		String s2=sc.next();
		System.out.println("Enter a last letter to find : ");
		String last=sc.next();
		boolean ans1=startsWith(s1,first);
		boolean ans2=endsWith(s2,last);
		System.out.println(ans1+" "+ans2);
	}
	public static boolean startsWith(String s1,String first)
	{
		char c[]=s1.toCharArray();
		char d[]=first.toCharArray();
		if(c[0]==d[0])
		{
			return true;
		}
		return false;
	}
	public static boolean endsWith(String s2,String last)
	{
		char c[]=s2.toCharArray();
		char d[]=last.toCharArray();
		if(c[c.length-1]==d[0])
		{
			return true;
		}
		return false;
	}
}
