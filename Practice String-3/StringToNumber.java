import java.util.*;
public class StringToNumber
{
	public static void main(String[] args)
	{
	String ans ="111";
	int res =strToNum(ans);
	System.out.println(res);
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