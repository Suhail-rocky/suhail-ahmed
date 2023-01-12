import java.util.*;
public class StringBuilders
{
	public static void main(String args[])
	{
	StringBuilder sb = new StringBuilder("Suhail");
	//Set Char
	System.out.println(sb.charAt(0));
	//Get Char
	sb.setCharAt(5,'b');
	System.out.println(sb);
	//Insert char
	sb.insert(1,'h');
	System.out.println(sb);
	/*delete char
	sb.delete(0,1);
	System.out.println(sb);*/
	//append
	sb.append("Ahmed");
	System.out.println(sb);
	//length
	System.out.println(sb.length());
	}
}