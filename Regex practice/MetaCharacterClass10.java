import java.util.regex.Matcher;
import java.util.regex.Pattern;
class MetaCharacterClass10
{
	public static void main(String[] args)
	{
		String sentence="Tamil Tamilan TamilNadu123&**!(";
		Pattern p = Pattern.compile(".");
		Matcher m = p.matcher(sentence);
		while(m.find())
		{
			System.out.println(m.group() +" starts at "+m.start());
		}
		// (.) = ellame print aagum includind words ,numbers,spaces,special characters
	}
}