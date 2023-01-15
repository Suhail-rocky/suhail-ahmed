import java.util.*;
public class Splitarray{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of array : ");
	int n = sc.nextInt();
	System.out.println("Enter the array : ");
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
	arr[i]=sc.nextInt();
	System.out.println("the array are : ");
	for(int i=0;i<n/2;i++)
	System.out.print(arr[i]+" ");
	System.out.println();
	for(int i=n/2;i<n;i++)
		System.out.print(arr[i]+" ");
	}
	}
