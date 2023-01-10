import java.util.*;
public class T3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int count =0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		T3 t = new T3();
		t.print(arr,n);
	}
	public void print(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i] < 0)
			{
				count++;
				
				
			}
			else if(arr[i] > 0)
			{
				count1++;
				
			}
			else if( arr[i] == 0)
			{
				System.out.print("Zero number are "+arr[i]);
			}	
			else if(arr[i] %2 == 0)
			{
				System.out.print("Even number are "+arr[i]);
			}
			else{
				System.out.print("ODD number are "+arr[i]);
			}
			}
		}
		System.out.print("Positive number are "+count);
		System.out.print("Negative number are "+count1);
		System.out.print("Negative number are "+count);
	}
