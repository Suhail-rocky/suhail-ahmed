import java.util.*;
public class test2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number of array : ");
	int n = sc.nextInt();
	int temp[] = new int[n];
	int arr[]= new int[n];
	for(int i=0;i<n;i++){
		arr[i] = sc.nextInt();
	}
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			for(int k=j+1;k<arr.length;k++){
						arr[i]+arr[j]+arr[k] = temp[i];
						temp[i] = temp[i] - arr[i];
}
}
			}
	for(int i=0;i<arr.length;i++)
	System.out.println(temp[i]);
	}
}
