import java.util.Scanner;
class LengthDemo
{
	public static void main(String[] args)
	{
		String s="abcd";
		System.out.println(length(s));
	}
	public static int length(String s)
	{
		int count=0;
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			count++;
		}
		return count;
	}
}