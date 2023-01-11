import java.util.*;
public class TwistedPrimeNumber
{
	public static void main(String[] args)
	{
		int count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no : ");
		int n=sc.nextInt();
		boolean ans = isPrime(n,2);
		int ans1 =reverse(n);
		boolean result=isPrime(ans1,2);
		
		if(ans == result)
		{
			System.out.println("It is a Twisted prime Number ");
		}
		else
		{
			System.out.println("It is not a  Twisted prime Number "+"\nit is a composite number ");
		}
	}
	static int reverse(int n)
	{
		int rem=0,rev=0;
		while(n != 0)
		{
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n/10;
		}
		return rev;
		
	}
	 static boolean isPrime(int n, int i)
    {
        // Base cases
        if (n <= 2) 
           return (n == 2) ? true : false; 
       if (n % i == 0) 
           return false; 
       if (i * i > n)

            return true;
        // Check for next divisor
        return isPrime(n, i + 1);
    }
}