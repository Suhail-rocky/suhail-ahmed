import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Quantifiers
{
	//Quantifiers = no of occurences
	public static void main(String[] args)
	{
		String sentence ="abaabbaabbbabab";
		Pattern p = Pattern.compile("a+");
		Matcher m=p.matcher(sentence);
		while(m.find())
		{
			System.out.println(m.group() +" starts at "+m.start());
		}
	}
}
// + = one allathu more than one thadave vanthal athu print aagum