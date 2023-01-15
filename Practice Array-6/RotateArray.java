import java.util.*;
public class RotateArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int temp =0;
		System.out.println("Enter the number of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array ; ");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println("The rotate array are : ");
		System.out.print(arr[arr.length-1]+" ");
		for(int i=0;i<arr.length-1;i++)
			System.out.print(arr[i]+" ");
	}
}