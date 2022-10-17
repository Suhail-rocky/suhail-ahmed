import java.util.Arrays;

public class ArrayApp {
  
  public static int tripletSumWithClosestToGivenSum(int[] arr, int sum) {
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
  
  public static void main(String[] args) {
    int arr[] = {-1,2,1,-4};
    
    System.out.println(ArrayApp.tripletSumWithClosestToGivenSum(arr, 1));
  }

}