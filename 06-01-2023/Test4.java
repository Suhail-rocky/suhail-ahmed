import java.util.*;
public class Test4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  no of row :");
		int row = sc.nextInt();
		System.out.println("Enter a no of Columns : ");
		int column = sc.nextInt();
		int arr[][] = new int[row][column];
		for(int i=0; i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			System.out.print(arr[0][i]+" ");
		}
		for(int j=1;j>row;j++)
		{
			System.out.print(arr[j][3]+" ");
		}
		for(int k=row-1;k>=0;k--)
		{
			System.out.print(arr[3][k]+" ");
		}
		for(int l=row-1;l>0;l--)
		{
			System.out.print(arr[l][0]+" ");
		}
		for(int m=0;m<row-2;m++)
		{
			System.out.print(arr[1][m]+" ");
		}
		/*
		
		for(int i=0; i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
		*/
	}
}