import java.util.*;
public class Threesum{
	public static void main(String[] args)
	{	
		int total =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array : ");
		int n = sc.nextInt();
		System.out.println("Enter a Target value :");
		int target = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a array :");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j = i+1;j<n;j++){
				for(int k=j+1;k<n;k++){
				if(arr[i] + arr[j] + arr[k] == target-1){
					total = arr[i]+arr[j]+arr[k];
					//System.out.println(" "+arr[i]+" "+arr[j]+" "+arr[k]);
					System.out.println(total);
					break;
				}
				else if(arr[i] + arr[j] + arr[k] == target+1){
					total = arr[i]+arr[j]+arr[k];
					//System.out.println(" "+arr[i]+" "+arr[j]+" "+arr[k]);
					System.out.println(total);
					break;
				}
				}
			}
		}
		System.out.println("0");
			
	}
}