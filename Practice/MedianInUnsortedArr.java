import java.util.*;
class MedianInUnsortedArr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array-1");
		int n1 = sc.nextInt();
		System.out.println("Enter a no of array-2");
		int n2 = sc.nextInt();
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		int mergedArr[]=new int[n1+n2];
		int x=0;
		System.out.println("Enter a array-1");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
			mergedArr[x++]=arr1[i];
			
		}
		System.out.println("Enter a array-2");
		for(int i=0;i<n2;i++)
		{
			arr2[i]=sc.nextInt();
			mergedArr[x++]=arr2[i];
		}
		for(int i=0;i<mergedArr.length;i++)
		{
			for(int j=i+1;j<mergedArr.length;j++)
			{
				if(mergedArr[i]>mergedArr[j])
				{
					int temp=mergedArr[i];
					mergedArr[i]=mergedArr[j];
					mergedArr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(mergedArr));
		int median=mergedArr.length/2;
		System.out.println("The Median of array is "+mergedArr[median]);
		
	}
}