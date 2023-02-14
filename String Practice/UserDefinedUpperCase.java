import java.util.Scanner;
public class UserDefinedUpperCase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.next();
		System.out.println(toUpperCase(s));
	}
	public static String toUpperCase(String s)
	{
		char c[]=s.toCharArray();
		String temp = "";
		for(int i=0;i<c.length;i++)
		{
			if(c[i] >= 'a' && c[i] <= 'z')
			{	
				temp += (char)((int)(c[i]-32));
			}
			else
			{
				temp += c[i];
			}
		}
		return temp;
	}
}