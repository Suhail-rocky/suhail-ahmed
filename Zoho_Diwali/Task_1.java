import java.util.*;
public class Task_1{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=scan.nextInt();
		int arr[]=new int[n];
		int z=0;
		System.out.println("Enter a TapWater Stone is : ");
		while(z<n){
			arr[z]=scan.nextInt();
			z++;
		}
			int total=0,total1=0;
		for(int i=1;i<n-1;i++){
			if(arr[i]==0){
			total1+=arr[0];
			}
		else if(arr[i]>arr[i+1]){
			total=total+(arr[0]-arr[i]);
		}
		}
		System.out.println("Length of the water is : "+(total+total1));
	}
}