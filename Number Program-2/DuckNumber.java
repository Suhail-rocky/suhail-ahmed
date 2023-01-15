/*
Duck Number which has Zero in it E.g>=402
*/
import java.util.*;
public class DuckNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		boolean ans = isDuckNumber(n);
		if(ans == true)
		{
			System.out.println("It is a Duck Numebr");
		}
		else
		{
			System.out.println("It is not a Duck Numebr");
		}
		
	}
	static boolean isDuckNumber(int n)
	{
		int rem=0,count=0;
		while(n != 0)
		{ 
			rem=n%10;
			if(rem == 0)
			{
				count++;
			}
			n = n/10;
			
		}
		if(count > 0)
			return true;
				return false;
	}
}