/*Spy number is sum of digit is equla to the Product of the Digit 123=>1+2+3=6 && 123>= 1*2*3=6*/
import java.util.*;
public class SpyNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		boolean ans=checkSpy(n);
		if(ans == true)
		{
			System.out.println("It is a Spy Number ");
		}
		else
		{
			System.out.println("It is not a Spy Number ");
		}
	}
	static boolean checkSpy(int n)
	{
		int rem=0,sum=0,product=1;
		while(n !=0)
		{
			rem = n%10;
			sum+=rem;
			product*=rem;
			n/=10;
		}
		if(sum == product)
			return true;
				return false;
	}
}