/*Neon Number is a Sum of digits of square of the number is equals to the number E.g 9=> 9 * 9 = 81 => 9 = 8 + 1*/  
import java.util.*;
public class NeonNumber
{
	public static void main(String[] args)
	{
	int m=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		m=n;
		n*=n;
		boolean ans = isNeon(n,m);
		if(ans == true)
		{
			System.out.println("Yes it is a Neon Number");
		}
		else
		{
			System.out.println("it is not a Neon Number");
		}
		
	}
	static boolean isNeon(int n,int m)
	{
		int rem=0,sum=0;
		while(n != 0)
		{
			rem = n % 10;
			sum += rem;
			n /= 10;
		}
		if(sum == m)
		{
			return true;
		}
		return false;
	}
}