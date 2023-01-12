/*An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, “abcd” and “dabc” are an anagram of each other.

Examples:

Input: str1 = “listen”  str2 = “silent”
Output: “Anagram”
Explanation: All characters of “listen” and “silent” are the same.

Input: str1 = “gram”  str2 = “arm”
Output: “Not Anagram”*/
import java.util.*;
public class AnagramString
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  String - 1");
		String s1=sc.next();
		System.out.println("Enter a  String - 2");
		String s2=sc.next();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			for(int j=0;j<c2.length;j++)
			{
				if(c1[i]==c2[j])
				{
					count++;
				}
			}
		}
		if(count == c1.length)
		{
			System.out.println("It is a anagram");
		}
		else
		{
			System.out.println("Not a anagram");
		}
		
	}
}