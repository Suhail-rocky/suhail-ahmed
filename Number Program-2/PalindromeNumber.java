import java.util.*;
public class PalindromeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int reverse=reverseNumber(n);
		if(n == reverse)
		{
			System.out.println("It is a Palindrome Number");
		}
		else
		{
			System.out.println("It is Not a Palindrome Number");
		}
		
	}
	static int reverseNumber(int n)
	{
		int rem=0,rev=0;
		while(n != 0)
		{
			rem = n%10;
			rev = rev * 10 + rem;
			n=n/10;
		}
		return rev;
	}
}