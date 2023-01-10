

import java.util.*;
public class Task_6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array1:");
		int m = sc.nextInt();
		System.out.println("Enter a no of array2:");
		int n = sc.nextInt();
		int arr1[] = new int[m];
		int arr2[] = new int[n];
		System.out.println("Enter a  array1:");
		for(int i=0;i<m;i++)
			arr1[i]=sc.nextInt();
		System.out.println("Enter a array2:");
		for(int i=0;i<n;i++)
			arr2[i]=sc.nextInt();
		int length = arr1.length+arr2.length;
		for(int i=0;i<arr2.length;i++) {
		if(arr1[i] != arr2[i]) {
			System.out.println(i);
			break;
		}
			
		}
	}
}