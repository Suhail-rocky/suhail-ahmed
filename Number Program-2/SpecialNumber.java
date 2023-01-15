/*Special Number is sum of digit + product of digit = original Number e.g => 59 = 5 + 9 + 5x9 */
import java.util.*;
public class SpecialNumber
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		boolean ans = isSpecialNo(n);
		if(ans == true)
		{
			System.out.println("It is a Special Number ");
		}
		else
		{
			System.out.println("It is not a SpecialNumber");
		}
	}
	static boolean isSpecialNo(int n)
	{	
		int check=n;
		int rem=0,sum=0,product=1;
		while(n != 0)
		{
			rem = n % 10;
			sum += rem;
			product *= rem;
			n /=10;
		}
		int ans = sum + product;
		//System.out.println(sum+" "+product+" "+ans);
		if(ans == check)
			return true;
				return false;
	}
}