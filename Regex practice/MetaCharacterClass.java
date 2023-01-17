import java.util.regex.Matcher;
import java.util.regex.Pattern;
class MetaCharacterClass
{
	public static void main(String[] args)
	{
		String sentence="Tamil Tamilan TamilNadu";
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher(sentence);
		while(m.find())
		{
			System.out.println(m.group() +" starts at "+m.start());
		}
	}
}