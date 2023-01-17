import java.util.regex.Matcher;
import java.util.regex.Pattern;
class MetaCharacterClass9
{
	public static void main(String[] args)
	{
		String sentence="TamilTamilan TamilNadu123&**!(";
		Pattern p = Pattern.compile("\\GTamil");
		Matcher m = p.matcher(sentence);
		while(m.find())
		{
			System.out.println(m.group() +" starts at "+m.start());
		}
		// (\\G) = munnadi word j=kuda namba thedukire word iruthal athuvum space illame otti vanthal athu print agum
	}
}