import java.util.*;
public class CommonElementsInThreeSortedArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array-1");
		int a=sc.nextInt();
		System.out.println("Enter a no of array-2");
		int b=sc.nextInt();
		System.out.println("Enter a no of array-3");
		int c=sc.nextInt();
		int arr1[]=new int[a];
		int arr2[]=new int[b];
		int arr3[]=new int[c];
		System.out.println("Enter a array-1");
		for(int i=0;i<a;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter a array-2");
		for(int i=0;i<b;i++)
		{
			arr2[i]=sc.nextInt();

		}
		
		System.out.println("Enter a array-3");
		for(int i=0;i<c;i++)
		{
			arr3[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				for(int k=0;k<c;k++)
				{
					if(arr1[i] == arr2[j] && arr2[j] == arr3[k])
					{
						System.out.println(arr1[i]);
					}
				}
			}
		}
		
				
	}
}
