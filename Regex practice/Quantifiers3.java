import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Quantifiers3
{
	public static void main(String[] args)
	{
		String sentence ="ababababaaaa";
		Pattern p=Pattern.compile("a?");
		Matcher m = p.matcher(sentence);
		while(m.find())
		{
			System.out.println(m.group() +" starts at "+m.start());
		}
	}
	//?= thani thaniya check panni print agum but antha letter illana space print aagum
}