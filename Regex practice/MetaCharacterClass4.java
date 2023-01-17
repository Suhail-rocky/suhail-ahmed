import java.util.regex.Matcher;
import java.util.regex.Pattern;
class MetaCharacterClass4
{
	public static void main(String[] args)
	{
		String sentence="Tamil Tamilan TamilNadu123";
		Pattern p = Pattern.compile("\\w");
		Matcher m = p.matcher(sentence);
		while(m.find())
		{
			System.out.println(m.group() +" starts at "+m.start());
		}
		// (\\w) = words ellam   print aagum
	}
}