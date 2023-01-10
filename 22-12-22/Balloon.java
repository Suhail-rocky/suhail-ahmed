import java.util.*;
public class Balloon
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int set =0;
	int coins=0;
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
			if(i==0)
			{
				
				set = arr[1-1];
				coins  +=set * arr[i] * arr[j];
				System.out.println(set+" "+arr[i]+" "+arr[j]);
			}
			
			if(i>0)
			{
				
				coins +=arr[i-1]*arr[i]*arr[j];
				System.out.println(arr[i-1]+" "+arr[i]+" "+arr[j]);
			}
		}
	}
	System.out.println(coins);

}
}