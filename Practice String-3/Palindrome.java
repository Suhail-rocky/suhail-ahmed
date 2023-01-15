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
		//System.out.println(s2);
		boolean ans = isPalindrome(s1,s2);
		//System.out.println(ans);
		if(ans == true)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is  not a palindrome");
		}
	}
	static boolean isPalindrome(String s1,String s2)
	{
		int count=0,flag=1;
		int str1=s1.length();
		int str2=s2.length();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		if(str1 == str2)
		{
			
			for(int i=0;i<str1;i++)
			{
				if(c1[i] != c2[i])
				{
					flag=0;
					break;
				}
			}
		}
		else
		{
			flag=0;
		}
		if(flag == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}