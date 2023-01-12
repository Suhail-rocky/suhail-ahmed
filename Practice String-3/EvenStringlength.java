/*Given a string str, write a Java program to print all words with even length in the given string. Examples:

Input: s = "This is a java language"
Output: This
        is
        java
        language 

Input: s = "i am GFG"
Output: am
*/
import java.util.*;
public class EvenStringlength
{
	public static void main(String[] args)
	{
		int count=0;
		String temp="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		s+=" ";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i] != 32)
			{
				count++;
				temp += c[i];
			}
			else
			{
				if(count % 2 == 0)
				{
					System.out.println(temp);
					count=0;
				}
				count=0;
				temp="";
			}
		}
	}
}