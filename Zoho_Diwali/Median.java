import java.util.*;
public class Task_9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array1 :");
		int n = sc.nextInt();
		System.out.println("Enter a no of array2 :");
		int m = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[m];
		int length = arr1.length+arr2.length;
		int mergedArray[] = new int[length];
		System.out.println("Enter a array1 :");
		for(int i=0;i<n;i++)
			arr1[i]=sc.nextInt();
		System.out.println("Enter a array2 :");
		for(int i=0;i<m;i++)
			arr2[i]=sc.nextInt();	

		int pos = 0;  
		for (int element : arr1)   
		{  
			mergedArray[pos] = element;  
			pos++;             
		}  
		for (int element : arr2) 
		{  
			mergedArray[pos] = element;  
			pos++;  
		}  
		for(int i=0;i<mergedArray.length;i++)
			System.out.print(mergedArray[i]+" ");  
		System.out.println();
		int temp=0;
		for(int i=0;i<mergedArray.length;i++){
			for(int j=i+1;j<mergedArray.length;j++){
				if(mergedArray[i]>mergedArray[j])
				{
					temp = mergedArray[i];
					mergedArray[i]=mergedArray[j];
					mergedArray[j]=temp;
				}
			}
		System.out.print(mergedArray[i]+" ");
		}
		System.out.println();
		if(mergedArray.length % 2 != 0)
		{
			System.out.println("The Median is "+mergedArray[mergedArray.length/2]);
		}
		else if(mergedArray.length % 2 == 0)
		{
			//System.out.println("The Median is"+mergedArray[mergedArray.length/2-1]);
			//System.out.println("The Median is"+mergedArray[mergedArray.length/2]);
			System.out.println("The Median is"+(mergedArray[mergedArray.length/2-1]+mergedArray[mergedArray.length/2])/2.0);
		}

		}  
	}