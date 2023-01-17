import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
class FindFirstAndLastWordUsingRegex
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s ="suhail is a good boy";
		Pattern p =Pattern.compile("^suhail");//starts uing the symbol- ^
		Matcher m = p.matcher(s);
		while(m.find())
		{
			System.out.println(m.group() + " starts ar "+m.start() +" and it ends at "+m.end());
		}
		Pattern ps =Pattern.compile("boy$");//End uing the symbol- $
		Matcher ms = ps.matcher(s);
		while(ms.find())
		{
			System.out.println(ms.group() + " starts ar "+ms.start() +" and it ends at "+ms.end());
		}
		Pattern p1 =Pattern.compile("s|a");//find a letter where it is = |
		Matcher m1 = p1.matcher(s);
		while(m1.find())
		{
			System.out.println(m1.group() + " starts ar "+m1.start() +" and it ends at "+m1.end());
		}
	}
}