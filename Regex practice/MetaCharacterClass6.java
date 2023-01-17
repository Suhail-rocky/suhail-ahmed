import java.util.regex.Matcher;
import java.util.regex.Pattern;
class MetaCharacterClass6
{
	public static void main(String[] args)
	{
		String sentence="Tamil Tamilan TamilNadu123&**!(";
		Pattern p = Pattern.compile("\\bTamil");
		Matcher m = p.matcher(sentence);
		while(m.find())
		{
			System.out.println(m.group() +" starts at "+m.start());
		}
		// (\\b) =  boundary words start le enge iroko athu ellam   print aagum
	}
}