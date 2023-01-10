import java.util.*;
//Task_8
public class Task_8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum=0;
		System.out.println("Enter a array :");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		sum+=arr[0];	
		for(int i=1;i+2<=n;i+=2)
			{
			//System.out.println(arr[i+2]);
			sum+=arr[i+2];
			}
		System.out.println(sum);
		}
	}
			
		