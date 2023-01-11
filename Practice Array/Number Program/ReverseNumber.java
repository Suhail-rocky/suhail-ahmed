import java.util.*;
public class ReverseNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		while(n != 0)
		{
			rem = n%10;
			rev = rev * 10+rem;
			n = n/10;
		}
	}
}