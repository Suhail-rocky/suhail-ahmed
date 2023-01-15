import java.util.*;
public class Str2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String : ");
	String s = sc.next();
	String temp="";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>=32 && s.charAt(i)<=64)
			continue;
		temp = temp + s.charAt(i);
	}
	System.out.println(temp);
	System.out.println("Enter a String : ");
	String st = sc.next();
	String temp2="";
	for(int i=0;i<st.length();i++)
	{
		if(s.charAt(i)>=32 && s.charAt(i)<=64)
			continue;
		temp2 = temp2 + s.charAt(i);
	}
	System.out.println(temp2);
	for(int i=0;i<temp.length();i++)
	{
		if(temp.charAt(i) ==  temp2.charAt(i))
		{
		
	}
		
			System.out.println(temp.charAt(i));
			System.out.println(temp2.charAt(i));
		}
}
}

