import java.util.*;
public class Triplets{
	public static void main(String[] args)
	{
		int temp = 0;
		int mul=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
			
		}
		for(int i=n-1,j=1;i>=0&&j<=3;i--,j++)
		{
			mul = mul*arr[i];
		}
			System.out.println(mul);
			for(int i = n-1,j=1;i>=0 && j<=3;i--,j++)
			{
				System.out.print(arr[i]+" ");
			}
	}
}
		