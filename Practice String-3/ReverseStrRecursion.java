import java.util.*;
public class ReverseStrRecursion
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		System.out.println(reverse(s,s.length()-1,""));
	}
	static String reverse(String s,int i,String rev)
	{
		char c;
		if(i == 0)
		{
			c=s.charAt(i);
			rev +=c;
			return rev;
		}
		c=s.charAt(i);
		return reverse(s,i-1,rev+c);
	}
	
}