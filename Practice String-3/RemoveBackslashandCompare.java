/*Input: s1= geee#e#ks, s2 = gee##eeks 
Output: True 
Explanation: Both the strings after processing the backspace character becomes “geeeeks”. Hence, true.

Input: s1 = equ#ual, s2 = ee#quaal#
Output:  False
Explanation: String 1 after processing the backspace character becomes “equal” whereas string 2 is “eequaal”. Hence, false.*/
import java.util.*;
public class RemoveBackslashandCompare
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String temp="",temp1="";
		System.out.println("Enter a String-1");
		String s1=sc.next();
		System.out.println("Enter a String-2");
		String s2=sc.next();
		char c[]=s1.toCharArray();
		char d[]=s2.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i] != '#')
			{
				temp+=c[i];
			}
		}
		for(int i=0;i<d.length;i++)
		{
			if(d[i] != '#')
			{
				temp1+=d[i];
			}
		}
		System.out.println(temp.equals(temp1));
		
	}
}