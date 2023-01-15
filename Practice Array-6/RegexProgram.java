import java.util.*;
import java.util.regex.*;
public class RegexProgram{
	public static void main(String[] suhail){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String1");
	String s = sc.next();
	System.out.println("Enter a String2");
	String p = sc.next();
	System.out.println(Pattern.matches(p,s));
}
}