import java.util.*;
public class ReverseString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			System.out.print(c);
		}
	}
}