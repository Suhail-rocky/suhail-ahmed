import java.util.*;
public class RemoveDuplicateses{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int count = 0;
	System.out.println("Enter a no of array : ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter the array : ");
	for(int i=0;i<n;i++)
		arr[i] = sc.nextInt();
	for(int i=0;i<n;i++){
		boolean repeated = false;
		for(int j=i+1;j<n;j++){
			if(arr[i] == arr[j]){
				repeated =true;
				break;
			}
		}
		
		if(!repeated){
		System.out.print(arr[i]+" ");
		}
		else 
			count++;
	}
	for(int i=0;i<count;i++)
	System.out.print("_ ");
	
		
}
}
	