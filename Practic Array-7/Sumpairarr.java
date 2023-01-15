import java.util.*;
public class Sumarr{
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
		if(arr[i] != 99){
			for(int j=i+1;j<n;j++){
				if(arr[i] == arr[j])
				{
					arr[j]=99;
				}	
			}
		}
	}
	
	for(int i=0;i<n;i++){
		System.out.print(arr[i] + " ");
	}
	
	
}
}
				
		