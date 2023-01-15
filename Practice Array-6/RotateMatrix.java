import java.util.*;
public class RotateMatrix{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of rows : ");
		int m = sc.nextInt();
		System.out.println("Enter a number of column : ");
		int n = sc.nextInt();
		int arr[][] = new int[m][n];
		System.out.println("Enter the array : ");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){				
			arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The array are : ");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){				
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){				
			System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
}	