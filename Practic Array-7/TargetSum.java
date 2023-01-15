import java.util.*;
public class TargetSum{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum =0;
		int count = 0;
		System.out.println("Enter a Target : ");
		int target = sc.nextInt();
		System.out.println("Enter a array : ");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println(sum);
		for(int i=0;i<n;i++){
			
			sum =-arr[i];
			for(int j=0;j<n;j++){
				if(i!=j)
				sum +=arr[j];
				
			}
			if( sum == target)
					count++;
		}
		System.out.println(count);
	}
}