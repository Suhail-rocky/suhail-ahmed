import java.util.*;
public class Baloon_Matrix{
	
	public static void main(String[] args)
	{
		char a1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of rows and columns :");
		int m = sc.nextInt();//rows
		int n = sc.nextInt();//columns
		String arr[][] = new String[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{	
				arr[i][j] = "-";
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{	
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		do {
		System.out.println("Enter a Column number : ");
		int j = sc.nextInt();
		System.out.println("Enter a Balloon Colour : ");
		arr[arr.length-1][j] = sc.next();
		for(int i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{	
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Do you want to continue Y/N");
		 a1=sc.next().charAt(0);
		}while(a1 == 'Y');
	}
}
		
