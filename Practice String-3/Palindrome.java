import java.util.*;
public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s1=sc.next();
		char c[]=s1.toCharArray();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2+=c[i];
		}
		System.out.println(s2);
		boolean ans = isPalindrome(s1,s2);
		if(ans)
			System.out.println("True");
				//System.out.println("false");
	}
	static boolean isPalindrome(String s1,String s2)
	{
		int count=0;
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			for(int j=0;j<c2.length;j++)
			{
				if(c1[i] == c2[j])
				{
					count++;
					break;
				}
			}
		}
		int ans = c1.length;
		if(ans == count)
			return true;
				return false;
	}
}