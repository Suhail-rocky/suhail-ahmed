/*You are given a string s. You can convert s to a palindrome by
adding characters in front of it.
Return the shortest palindrome you can find by performing this
transformation.
Input: s = "aacecaaa"  
Output: "aaacecaaa"
Input: s = "abcd"
Output: "dcbabcd*/
import java.util.*;
public class Task_13 {
	static boolean ispalindrome(String s) {
		int l = s.length();

		for (int i = 0, j = s.length()-1; i <= j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s =sc.next();
		int flag = 0;
		String t = "";
		char c;
		for(int i=0;i<s.length();i++)
		{
			c = s.charAt(i);
			t=c+t;
		}
		int j=1;flag =0;
		while (flag == 0) {
			t = t + s.charAt(j);
			if (ispalindrome(t)) {
				System.out.println(t);
				flag = 1;
			}
				j++;
		}
	}
}