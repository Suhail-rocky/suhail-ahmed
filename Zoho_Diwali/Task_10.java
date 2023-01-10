import java.util.*;
public class Task_10{
	static void findMissing_2_arr(int []arr1,int n,int []arr2,int m)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr1[i] == arr2[j])
				{
					arr1[i]=-1;
					
				}
			}
			if(arr1[i] != -1)
			System.out.println(arr1[i]);
	}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array1 : ");
		int n = sc.nextInt();
		System.out.println("Enter a array1 :");
		int arr1[] = new int[n];
		for(int i=0;i<n;i++)
			arr1[i] = sc.nextInt();
		System.out.println("Enter a no of array1 : ");
		int m = sc.nextInt();
		System.out.println("Enter a array1 :");
		int arr2[] = new int[m];
		for(int i=0;i<m;i++)
			arr2[i] = sc.nextInt();
		findMissing_2_arr(arr1,n,arr2,m);
		
	}
}
		