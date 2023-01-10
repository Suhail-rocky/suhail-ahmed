import java.util.*;
public class ThreeSortedArrayCommomElements
{
	public static void main(String[] args)
	{
		int i1=0,j=0,k=0,s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array-1: ");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		System.out.println("Enter a array-1 : ");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter a no of array-2: ");
		int m = sc.nextInt();
		int arr2[] = new int[m];
		System.out.println("Enter a array-2 : ");
		for(int i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("Enter a no of array-3: ");
		int o = sc.nextInt();
		int arr3[] = new int[o];
		System.out.println("Enter a array-3 : ");
		for(int i=0;i<o;i++)
		{
			arr3[i]=sc.nextInt();
		}
		int ans=m+n+o;
		int common[] = new int[ans];
		while(i1<arr1.length && j<arr2.length && k < arr3.length)
		{
			if(arr1[i1] == arr2[j] && arr2[j] == arr3[k])
			{
				System.out.println(arr3[k]);
				common[s]=arr3[k];
				s++;
			}
			i1++;
			j++;
			k++;
		}
		for(int i=0;i<ans;i++)
		{
			if(common[i] != 0)
			{
				System.out.print(common[i]+" ");
			}
		}
		System.out.println(Arrays.toString(common));
		
	}
}