import java.util.*;
public class LongestSubstringWithoutrepentance
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		int index=0;
		String ans = checkSubsequence(s,0,index,"");
		System.out.println(ans);
		System.out.println(ans.length());
	}
	static String checkSubsequence(String str,int i,int index,String s)
	{
		if(i == str.length())
		{
			return s;
		}
		for(int j=str.length()-1;j>=0;j--)
		{
			String str1= "";
			for(int k=i;k <= j;k++)
			{
				str1 += str.charAt(k);
			}
			if(checkrepentance(str1))
			{
				if(str1.length() > index)
				{
					index = str1.length();
					s=str1;
				}
			}
		}
		checkSubsequence(str,i+1,index,s);
		return s;
	}
	static boolean checkrepentance(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i) == s.charAt(j))
					return false;
			}
		}
		return true;
	}
}