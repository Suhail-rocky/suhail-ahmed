import java.util.*;
public class Test4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a row of matrix : ");
		int rows = sc.nextInt();
		System.out.println("Enter a column of matrix : ");
		int columns = sc.nextInt();
		int matrix[][] = new int[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		int sum=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<=i;j++)
			{
				sum+=matrix[i][j];
			}
		}
		int dum=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=rows-1-i;j<rows;j++)
			{
				dum+=matrix[i][j];
			}
		}
		if(sum < dum)
		{
			System.out.println(dum);
		}
		else
		{
			System.out.println(sum);
		}
		
	}
}