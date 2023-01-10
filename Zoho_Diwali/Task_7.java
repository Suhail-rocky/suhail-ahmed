import java.util.*;
public class Task_7{
	static int temp =0;
	static int n;
	
	static void thirdlargest(int[] arr)
	{	
		
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){		
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		//System.out.print(arr[i]+" ");
	}
	
	if(arr.length < 3)
	{
		System.out.println("-1");
	}
	else
	{
	System.out.println(arr[arr.length-3]);
	}
}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Third_Largest t = new Third_Largest();
		System.out.println("Enter a no of array :");	
		n = sc.nextInt();
		System.out.println("Enter a array :");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		thirdlargest(arr);
	}
}
		
		