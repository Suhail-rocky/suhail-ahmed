import java.util.*;
public class Mono_Digit{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of digits");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=1;i<n;i++)
		{
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]+arr[j] == arr[0] && arr[arr.length-2] - arr[arr.length-1] == arr[0])
			{
				System.out.println(+(arr[i]+arr[j])+" "+arr[0]+" "+(arr[arr.length-2]-arr[arr.length-1]));
				break;
			}
			else
			{
				System.out.println("Cant monoDigit ");
				break;
			}
		}
	}
	
	}
	} 