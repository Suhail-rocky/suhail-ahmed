/* Harshad Number is divisible by Sum of its digits e.g >= 156 = 1 + 5 + 6 = 12*/
import java.util.*;
public class HarshadNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		boolean ans = isHarshadNumber(n);
		if(ans == true)
		{
			System.out.println("Yes it is a Harshad Number :");
		}
		else
		{
			System.out.println("No it is not a HarshadNumber");
		}
	}
	static boolean isHarshadNumber(int n)
	{
		int rem=0,sum=0;
		while(n != 0)
		{
			rem = n%10;
			sum+=rem;
			n/=10;
		}
		if(n % sum == 0)
			return true;
				return false;
		
		
	}
}