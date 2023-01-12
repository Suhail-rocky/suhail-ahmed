import java.util.*;
public class ReverseWord
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.nextLine();
		String temp="",rev="",word="";
		s += " ";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i] != 32)
			{
			word += c[i];
			}
			else
			{
				rev=word+" "+rev;
				word="";
			}
		}
		System.out.println(rev);
	}
}