/*Pronic Number is a product of two consecutive Integers , n(n+1) E.g56 = 7 x 8*/
import java.util.*;
public class PronicNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(n % i == 0)
				if(i * (i+1) == n) fact = i;
		}
		if(fact != 0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}