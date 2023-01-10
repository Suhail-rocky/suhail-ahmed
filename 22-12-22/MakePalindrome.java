import java.util.*;
public class MakePalindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String temp = "";
		String reverse="";
		String temp1="";
		String s = sc.next();
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			temp+=c[i];
		}
		char a[] =temp.toCharArray();
		for(int i=a.length-1;i>0;i--)
		{
				reverse+=a[i];
		}
		if(temp.equals(reverse))
		{
			System.out.println("true");
		}
		else
		{
			
			temp1+=c[c.length];
			for(int i=0;i<c.length;i++)
			{
				temp1+=c[i];
			}
			System.out.println(temp1);
		}
	}
}