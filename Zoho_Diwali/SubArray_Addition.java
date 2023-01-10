import java.util.*;
public class Task_5{
	static int n;
	static int count;
	static int lenOfLongSubarr(int arr[],int arr_size,int sum)
	{
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				for(int k=j+1;k<n;k++){
					for(int l=k+1;l<n;l++){
						if(arr[i]+arr[j]+arr[k]+arr[l] == sum)
						{
							System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]);
							count++;
						}
						else
						{
							System.out.println("0");
						}
					
						return 0;
						}
					}
				}
			}
		return 1;	
	 }
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no of array:");
	n = sc.nextInt();
	System.out.println("Enter a array :");
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
	arr[i]=sc.nextInt();
	int arr_size=arr.length;
	System.out.println("Enter the sum value :");
	int sum=sc.nextInt();
	lenOfLongSubarr(arr,arr_size,sum);
}
}