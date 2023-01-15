import java.util.*;
public class Subsetarr{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of array : ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter the sum value : ");
	int sum = sc.nextInt();
	System.out.println("Enter the array : ");
	for(int i=0;i<n;i++)
		arr[i] = sc.nextInt();
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(arr[i] + arr[j] == sum)
				System.out.println("("+arr[i]+","+arr[j]+")");
		}
	}
	}
}
				
		