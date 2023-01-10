import java.util.*;
public class Scalarmatrix
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a row : ");
		int row = sc.nextInt();
		System.out.println("Enter a Column : ");
		int column = sc.nextInt();
		int matrix1[][] = new int[row][column];
		System.out.println("Enter the Matrix :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter a Scalar Multiply No :");
		int n=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix1[i][j]*=n;
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}