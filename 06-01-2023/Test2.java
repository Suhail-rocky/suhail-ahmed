/*
Check if an array is formed by consecutive integers

Input  {-1,5,4,2,0,3,1}

Output The array contains consecutive integers from -1 to 5.

 

Input {4,2,4,3,1}

Output The array does not contain consecutive integers as element 4 is repeated.
*/
import java.util.*;
public class Test2
{
	public static void main(String[] args)
	{
		boolean flag = false;
		int repeat=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int arr[] =new int[n];
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
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				else if(arr[i] == arr[j])
				{
					flag = true;
					repeat=arr[j];
					
				}
			}
		}
		if(flag == false)
		{
			System.out.println("The array contains consecutive integers from "+arr[0]+" to "+arr[arr.length-1]);
		}
		else
		{
			System.out.println("The array does not contain consecutive integers as element "+repeat+" is repeated");
		}
	}
		
	}
