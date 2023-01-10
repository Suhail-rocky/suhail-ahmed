import java.util.*;
public class Test8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String temp="",reverse="";
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i] >= 32 && c[i] <= 63 )
			{
				continue;
			}
			temp+=c[i];
		}
		System.out.println(temp);
		char rev[]=temp.toCharArray();
		for(int i=rev.length-1;i>=0;i--)
		{
			reverse+=rev[i];
		}
		System.out.println(reverse);
		if(temp.equals(reverse))
		{
			System.out.println("It is a palindrome ");
			
		}
		else
		{
			System.out.println("It is not a palindrome ");
		}
		
	}
}