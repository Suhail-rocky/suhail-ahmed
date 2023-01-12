import java.util.*;
public class LetterToNumber{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.next();
		int res =0;
		for(int i=0;i<str.length();i++)
		{
			res *= 26;
			res +=(str.charAt(i)-'A'+1);
		}
		System.out.println(res);
	}
}
		