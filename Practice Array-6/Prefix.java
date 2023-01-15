import java.util.*;
public class Prefix{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		String s[] = new String[n];
		System.out.println("Enter the String : ");
		for(int i=0;i<n;i++)
		{
			s[i] = sc.next();
		}
		String ans = s[0];
		for(int i=1;i<n;i++)
		{
			ans= prefix(ans,s[i]);
		}
		System.out.println("The prefix String are "+ans);
	}
	public static String prefix(String s,String t)
	{
      		String temp="";
		for(int i=0,j=0;i<s.length() && j<t.length();i++,j++){
		if(s.charAt(i) != t.charAt(j))
		break;
		 temp = temp+t.charAt(i);
	}
		return temp;
	}
}
	
		
