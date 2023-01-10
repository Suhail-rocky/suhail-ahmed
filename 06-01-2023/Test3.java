/*3) Replace the characters in a string based on the transformation: A --> Z, B --> Y, C -->X and so on..

Input:

FADE

Output:

UZWV.
*/
import java.util.*;
public class Test3
{
	public static void main(String[] args)
	{
		String temp ="";
		int copy=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i] >= 65 && c[i] <= 90 )
			{	
				temp +=(char) (90 -(int)c[i] + 65);
			}
			else if( c[i] >= 97 && c[i] <= 122)
			{
				temp +=(char)(122 -(int)c[i] + 97);
			}
		}
		System.out.println(temp);
		
		
	}
}