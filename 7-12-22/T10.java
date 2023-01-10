import java.util.*;
public class T10
{
	public static void main(String[] args)
	{
		int max = 0;
		int row =-1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of row : ");
		int n = sc.nextInt();
		System.out.println("Enter a no of columns : ");
		int m = sc.nextInt();
		int arr[][] = new int[m][n];
		System.out.println("Enter a array :");
		for(int i=0;i<n;i++)
		{
			int count = 0;
			for(int j=0;j<n;j++)
			{
				arr[i][j] = sc.nextInt();
				if(arr[i][j] == 1)
					count++;
			}
		}
		
		if(count > max)
		{
			row = i;
			count =max;
		}
		if(row != -1)
		{
		System.out.println(row);	
		}
		else
		{
			System.out.println("All numbers have Zero only ");
		}
			
	}
}
	
			
	
	
