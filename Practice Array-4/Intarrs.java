import java.util.*;
public class Intarrs{
	public static int tripletSum(int[] arr,int sum){
	//Arrays.sort(arr);
	int temp =0;
	for(int i=0;i<arr.length-1;i++){
		for(int j = i+1;j<arr.length-1;j++){
			if(arr[i] < arr[j])
			{
				arr[i] = temp;
				arr[i] = arr[j];
				temp = arr[i];
			}
		}
		System.out.print(arr[i]+" ");
	}
	
				
	
	int minDifference = Integer.MAX_VALUE;
	int closestSum = Integer.MAX_VALUE;
    
    for(int i = 0; i < arr.length - 2; i++) {
      
      int start = i + 1;
      int end = arr.length - 1;
      
      while(start < end) {
        int tripletSum = arr[i] + arr[start] + arr[end];
        
        if((sum - tripletSum) <= minDifference && tripletSum < closestSum) {
          minDifference =(sum - tripletSum);
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
		