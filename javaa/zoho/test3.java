import java.util.*;
public class test3{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of array : ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter an array : ");
	for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
	}
	System.out.println("Enter Target : ");
	int target = sc.nextInt();
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i] + arr[j] == target)
				System.out.println(arr[i]);
			}
		}
	}
}