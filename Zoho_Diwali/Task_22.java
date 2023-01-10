import java.util.*;

public class Task_22
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value :");
	int n= sc.nextInt();
	int i, j, min;
	System.out.println("Value of n: " + n);

	for (i = 1; i <= n; i++)
	{
		for (j = 1; j <= n; j++)
		{
			min = i < j ? i : j;
			System.out.print(n - min + 1);
		}
		System.out.println();
	}
}
}