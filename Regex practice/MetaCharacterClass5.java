import java.util.regex.Matcher;
import java.util.regex.Pattern;
class MetaCharacterClass5
{
	public static void main(String[] args)
	{
		String sentence="Tamil Tamilan TamilNadu123&**!(";
		Pattern p = Pattern.compile("\\W");
		Matcher m = p.matcher(sentence);
		while(m.find())
		{
			System.out.println(m.group() +" starts at "+m.start());
		}
		// (\\W) = words thavira ellam   print aagum
	}
}