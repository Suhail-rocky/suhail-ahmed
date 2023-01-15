import java.util.*;
public class Plusone
{
	public static int[] plusone(int[] digits)
	{
		int i = digits.length-1;
		while(i >= 0)
		{
			if(digits[i] != 9)
			{
				digits[i] = digits[i] + 1;
				return digits;
			}
			digits[i] = 0;
			i--;
		}
		int[] res = new int[digits.length + 1];
		res[0] = 1;
		return res;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array : ");
		int n = sc.nextInt();
		System.out.println("Enter a array : ");
		int[] digits = new int[n];
		for(int i=0;i<n;i++)
			digits[i]=sc.nextInt();
		plusone(digits);
		for(int i=0;i<n;i++)
			System.out.print(digits[i]+" ");
		System.out.println(Arrays.toString(digits));
	}
}	