import java.util.regex.Matcher;
import java.util.regex.Pattern;
class MetaCharacterClass7
{
	public static void main(String[] args)
	{
		String sentence="Tamil Tamilan TamilNadu123&**!(";
		Pattern p = Pattern.compile("\\bTamil\\b");
		Matcher m = p.matcher(sentence);
		while(m.find())
		{
			System.out.println(m.group() +" starts at "+m.start());
		}
		// (\\b) =  boundary words  start laiyum erakanum endle kuda irukanum athu ellam   print aagum
	}
}