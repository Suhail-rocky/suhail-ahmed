/*PerfectNumber is equla to the sum of its divisor or factors except Itself E.g 6 = 1+2+3*/
import java.util.*;
public class PerfectNumber{
public static void main(String[] args)
{
	int sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number :");
	int n = sc.nextInt();
	for(int i=1;i<n;i++)
	{
		if(n%i ==0)
		{
			sum += i;
			//System.out.println(i);
		}
	}
	if(sum == n)
	{
		System.out.println("It is a Perfect Number ");
	}
	else
	{
		System.out.println("Not a Perfect Number");
	}
	boolean ans = isPerfectNumber(n,1);
	if(ans == true)
	{
		System.out.println("It is a Perfect Number ");
	}
	else
	{
		System.out.println("Not a Perfect Number");
	}
}
	static boolean isPerfectNumber(int n,int i)
	{
		int sum=0;
		int count = 0;
		if(i == n)
		{
			return (count == 1) ? true : false; 
		}
		if(n % i == 0)
		{
			sum += i;
		}
		if(sum == n)
		{
			count++;
		}
		return  isPerfectNumber(n,i+1);
	}
}