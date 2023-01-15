import java.util.*;
public class test1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter the number of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int temp[] = new int[n];
		System.out.println("Enter the array : ");
		for(int i=0;i<arr.length;i++)
		arr[i]=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp[i] = arr[i];
					arr[i] = arr[j];
					arr[j] = temp[i];
					}
				if(arr[i] == arr[j])
				System.out.println("They are not consecutive integers  ");
				}
			}
	
		System.out.println("The array are consecutive integers");
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
}
}

