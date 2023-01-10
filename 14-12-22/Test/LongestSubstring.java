import java.util.*;
public class LongestSubstring {
 
     public static int lengthOfLongestSubstring(String s) {
 
         int maxCount = 0;
         int i = 0;
         int j = 0;
         int strLen = s.length();
 

         Set<Character> st = new HashSet<>();
 

         while(i < strLen && j < strLen) {
 
             if(!st.contains(s.charAt(j))) {
                 st.add(s.charAt(j));
                 j++;
                 maxCount = Math.max(maxCount, j-i);
              } else {
                 st.remove(s.charAt(i));
                 i++;
              }
          }
 
        return maxCount;
    }
 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		System.out.println("Enter a String :");
         String str = sc.next();
         int len = lengthOfLongestSubstring(str);
 
         System.out.println(" Length  : " + len);
     }
}