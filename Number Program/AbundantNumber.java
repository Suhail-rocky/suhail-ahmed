/*Abundant Number is Sum of Factor is Greater than number ifself E.g Factor of 12 = 1+2+3+4+6=16>12*/ 
import java.util.*;
public class AbundantNumber
{	
	public static void main(String[] args)
	{
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i == 0)
			{
				sum += i;
				//System.out.println(i);
			}
		}
		//System.out.println(sum);
		if(sum > n)
		{
			System.out.println("It is a Abundant Number ");
		}
		else
		{
			System.out.println("Not a AbundantNumber");
		}
	}
}