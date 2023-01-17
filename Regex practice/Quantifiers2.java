import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Quantifiers2
{
	public static void main(String[] args)
	{
		String sentences="aabaababababa";
		Pattern p =Pattern.compile("a*");
		Matcher m=p.matcher(sentences);
		while(m.find())
		{
			System.out.println(m.group() +" starts at "+m.start());
		}
	}
	// (*) - one allathu more than one irunthalum print aagum antha letter varathe idathule space print aagum 
}