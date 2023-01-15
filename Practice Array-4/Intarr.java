import java.util.*;
public class Intarr{
	public static int tripletSum(int[] arr,int sum){
	Arrays.sort(arr);
	
	int minDifference = Integer.MAX_VALUE;
	int closestSum = Integer.MAX_VALUE;
    
    for(int i = 0; i < arr.length - 2; i++) {
      
      int start = i + 1;
      int end = arr.length - 1;
      
      while(start < end) {
        int tripletSum = arr[i] + arr[start] + arr[end];
        
        if(Math.abs(sum - tripletSum) <= minDifference && tripletSum < closestSum) {
          minDifference = Math.abs(sum - tripletSum);
          closestSum = tripletSum;
        }
        
        if(tripletSum == sum) {
          return tripletSum;
        } else if(tripletSum < sum) {
          start++;
        } else {
          end--;
        }
      }
    }
    
    return closestSum;
  }
	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of array : ");
		int n = sc.nextInt();
		System.out.println("Enter a array");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter a Target value : ");
		int target = sc.nextInt();
		System.out.println(Intarr.tripletSum(arr,target));
		}
}
		