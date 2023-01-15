import java.util.*;
public class SubarrPosNeg{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter the number of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array : ");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				for(int k=j+1;k<n;k++){
					for(int l=k+1;l<n;l++){
						if(arr[i] == 0 || arr[j] == 0 ||  arr[k] == 0 || arr[l] == 0 || arr[arr.length-1] == 0){
							System.out.println("Yes");
							count++;
							break;
						}
					else if(arr[j] + arr[k] +arr[l] == 0){
						System.out.println("Yes");
							count++;
							break;
					}
						else if(count == 0) {
							System.out.println("No");
							break;
						} 
						
					}
				}
			}
		}
	}
}