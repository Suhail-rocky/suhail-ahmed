/*Deficient Number is Sum of Factor is Lesser than number ifself E.g Factor of 21 = 1+3+7=11<21*/ 
import java.util.*;
public class Deficient{
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
		if(sum < n)
		{
			System.out.println("It is a Deficient Number ");
		}
		else
		{
			System.out.println("Not a Deficient Number");
		}
	}
}