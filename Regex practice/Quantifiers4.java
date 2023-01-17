import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Quantifiers4
{
	public static void main(String[] args)
	{
		String sentence ="abababaaa";
		Pattern p =Pattern.compile("a{2}");
		Matcher m=p.matcher(sentence);
		while(m.find())
		{
			System.out.println(m.group()+"starts at "+m.start());
		}
		Pattern p1 =Pattern.compile("a{1,3}");
		Matcher m1=p1.matcher(sentence);
		while(m1.find())
		{
			System.out.println(m1.group()+" starts at "+m1.start());
		}
		//{2}= 2 times enge ellam iruku athu print aagum
		//{1,3}=  1 lenthu 3 times varaikum print aagum 
	}
}