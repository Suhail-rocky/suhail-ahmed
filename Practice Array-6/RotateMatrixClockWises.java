import java.util.*;
public class RotateMatrixClockWises{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of rows : ");
		int m = sc.nextInt();
		System.out.println("Enter a number of columns : ");
		int n = sc.nextInt();
		int arr[][] = new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The matrix : \n");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(" "+arr[i][j]+"\t");
				}
				System.out.println("\n");
			}
		System.out.println("Rotate Matrix by 90 Degrees Clockwise : \n");
		for(int i=0;i<m;i++){
			for(int j=n-1;j>=0;j--){
				System.out.print(""+arr[j][i]+"\t");
				}
			System.out.println("\n");
			}
}
}