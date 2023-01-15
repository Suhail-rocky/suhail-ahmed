// Add One to Number Represented as Array - Java Code
public class PlusOnes {
 
   public static int[] plusOne(int[] digits) {
        
        int i = digits.length-1;
        
        while(i >= 0) {
            
            if(digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
            
            digits[i] = 0;
            i--;
        }
        
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
 
  public static void main(String[] args) {
 
       int[] digits = {1, 2, 9};
       //Method call to add 1
       plusOne(digits);
 
       System.out.println(Arrays.toString(digits));
  }
}
