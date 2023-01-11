import java.util.*;
public class PrimeNumber
{
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
	
  public static void main(String[] args)
  { 
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (isPrime(n, 2))
      System.out.println("Yes it's a Prime");
   else
     System.out.println("Not a Prime");
   }
 }