import java.util.*;
public class Subset1 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of array :");
		int n = sc.nextInt();
		System.out.println("Enter a array :");
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
      
       
		System.out.println("Enter a sum value");
         int k =sc.nextInt();
        System.out.println("k = " + k);
   
        findFixedSumPairs(a, k);
    }

    public static void findFixedSumPairs(int[] a, int k) {
       recursiveFixedSumPairs(a, -1, 0, k);
    }

    private static void recursiveFixedSumPairs(int[] array, int subPair1, int index, int k) {
//        // pairs whose sum equals k are printed in this method
//        if ((array[subPair1] + array[subPair2]) == k) {
//            System.out.println("[" + array[subPair1] + ", " + array[subPair2] + "]");
//        } else if ((array[subPair1] + array[subPair2]) > k) {
//            recursiveFixedSumPairs(array, subPair1, subPair2 - 1, k);
//        } else {
//            recursiveFixedSumPairs(array, subPair1 + 1, subPair2, k);
//        }

            if (index == array.length) {
                return;
            }

            else if (index == array.length-1) {

                if (subPair1!= -1 && subPair1 + array[index] == k) {
                    System.out.println(""+subPair1 +" "+ array[index]);
                }

                else {
                    return;
                }
            }

            if (subPair1 != -1) {

                if (array[index] == k- subPair1) {
                    System.out.println(""+subPair1 +" "+ array[index]);
                    return;
                } else {
                    recursiveFixedSumPairs(array, subPair1, index + 1, k);
                }

            } else {
                recursiveFixedSumPairs(array, array[index], index+1, k);
                recursiveFixedSumPairs(array,-1, index+1, k);
            }
        }
}
