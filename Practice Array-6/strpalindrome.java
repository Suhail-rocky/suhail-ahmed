import java.util.Scanner;

import java.util.*;
public class strpalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			
			if(s.charAt(i)== ' '){ 
				continue;
			}
			if(s.charAt(i)>=  '!' && s.charAt(i) <='/'){
				continue;
			}
			rev = rev + s.charAt(i);
			//System.out.println(rev);
		}
		
		if(s.equals(rev))
		{
			System.out.println("It is a palindrome ");
		}
		else
		{
			System.out.println("It is not a palindrome ");
		}

	}

}
