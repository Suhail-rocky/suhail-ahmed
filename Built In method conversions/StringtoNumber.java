import java.util.*;
public class StringtoNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i =strToNum(s);
		System.out.println(i);
		
	}
	public static int strToNum(String s) 
	{	   
		int num = 0; 
		int n = s.length(); 
		for(int i = 0; i < n; i++) 
		{
			num = num * 10 + ((int)s.charAt(i) - 48); 
		}
		return num; 
	}
}
