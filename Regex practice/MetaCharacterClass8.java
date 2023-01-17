import java.util.regex.Matcher;
import java.util.regex.Pattern;
class MetaCharacterClass8
{
	public static void main(String[] args)
	{
		String sentence="Tamil Tamilan TamilNadu123&**!(";
		Pattern p = Pattern.compile("Tamil\\B");
		Matcher m = p.matcher(sentence);
		while(m.find())
		{
			System.out.println(m.group() +" starts at "+m.start());
		}
		// (\\B) =  antha word starting le vara kudathu but ending le varanum
	}
}