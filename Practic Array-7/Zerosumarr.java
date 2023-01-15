import java.util.Scanner;

public class Zerosumarr{
	public static void main(String[] args) {
		System.out.println("Enter the number of array :");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int [size];
		System.out.println("Enter the number of elements : ");
		for(int i=0;i<size;i++)
		{
		arr[i]=s.nextInt();
		}
		int n = arr.length;
		int temp[]=new int[n];
		int k=0;
		System.out.println( "Original array: " );
		for ( int i = 0 ; i < n; i++){
			System.out.println(arr[i] + " " );
			System.out.println();
			
	}
	for(int i=0;i<n-1;i++){
		if(arr[i] == arr[i+1])
		{
			arr[i]=arr[i]+arr[i+1];
			arr[i+1]=0;
		}
	}
		for(int i=0;i<n;i++){
			if(arr[i]!=0){
				temp[k++]=arr[i];
			}
		}
		System.out.println( "Modified array: " );

		for(int i=0;i<n;i++){
			System.out.println(temp[i] +" " );
			System.out.println();
		}
				
			}
			
			
		
	}


	


