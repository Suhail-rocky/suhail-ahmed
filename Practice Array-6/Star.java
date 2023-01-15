import java.util.*;
public class Star{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a A:");
	String a = sc.nextLine();
	System.out.println("Enter a B:");
	String b = sc.nextLine();
	boolean flag = false;
	for(int i=0;i<a.length();i++){
		for(int j=0;j<b.length();j++){
			if(a.length() == b.length())
			{
				flag = true;
			
			if (a.charAt(i) == '*')
			{
				if(b.charAt(j) == '*')
					flag = true;
			}
			if(a.charAt(i) == '.')
			{
			if(b.charAt(i) == '.')
			{
				flag = true;
			}
			}
			}
		}
		
	}
	System.out.println(flag);
}
}
					
