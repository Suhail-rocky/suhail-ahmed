/*Given two arrays A1[] and A2[], sort A1 in such a way that the relative order among the
elements will be same as those are in A2. For the elements not present in A2, append them at last
in sorted order.
Input: A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}          A2[] = {2, 1, 8, 3}
Output: A1[] = {2, 2, 1, 1, 8, 8, 3, 5, 6, 7, 9}
Input: A1[] = {4, 5, 1, 1, 3, 2}              A2[] = {3, 1}
Output: A1[] = {3, 1, 1, 2, 4, 5}*/
import java.util.*;
class P2
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array-1");
		int n1=sc.nextInt();
		System.out.println("Enter a no of array-2");
		int n2=sc.nextInt();
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int temp[]=new int[n1+n2];
		int x=0,y=0,count=0;
		for(int i=0;i<n2;i++)
		{
			for(int j=0;j<n1;j++)
			{
				if(arr2[i] == arr1[j])
				{
					temp[x++]=arr1[j];
					arr1[j]=0;
					count++;
				}
			}
		}	
		int temp1[]=new int[count];
		for(int i=0;i<n1;i++)
		{
				if(arr1[i] != 0)
				{
					temp1[y++]=arr1[i];
				}
		}
		for(int i=0;i<temp1.length;i++)
		{
			for(int j=i+1;j<temp1.length;j++)
			{
				if(temp1[i]>temp1[j])
				{
					int tem=temp1[i];
					temp1[i]=temp1[j];
					temp1[j]=tem;
				}
			}
		}
		//System.out.println(Arrays.toString(temp1));
		for(int i=0;i<temp1.length;i++)
		{
			if(temp1[i] != 0)
			{
				temp[x++]=temp1[i];
			}
		}
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i] != 0)
			{
				System.out.print(temp[i]+" ");
			}
		}
		//System.out.println(Arrays.toString(temp));
		//System.out.println(Arrays.toString(temp1));
		
	}
}
