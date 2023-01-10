import java.util.*;

public class Task_2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no of array : ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter a array : ");
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	for(int i=1;i<n;i++)
		System.out.print(arr[i]+" ");
	System.out.print(arr[0]);
}
}