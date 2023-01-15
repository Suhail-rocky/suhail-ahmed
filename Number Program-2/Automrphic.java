/* AutoMorphic number is a contained in a last digit of its square 25>= 625*/
import java.util.*;
public class Automrphic
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		boolean ans = isAutomorphic(n);
		if(ans == true)
			System.out.println("True");
		else
			System.out.println("False");
	}
	static boolean isAutomorphic(int n)
	{
		int m=n;
		int flag=0,q=n*n;
		while(n != 0)
		{
			int d=n%10;
			int d1=q%10;
			if(d != d1) flag=1;
			n /= 10; q /= 10;
		}
		if(flag == 0)
			return true;
				return false;
		}
	}
