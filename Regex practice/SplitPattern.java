import java.util.regex.Pattern;
import java.util.regex.Matcher;
class SplitPattern
{
	public static void main(String[] args)
	{
		//using string regex
		String sentences ="my name is suhail";
		String sentence2="www.SuhailStudy.com";
		String st[]=sentences.split("\\s");
		String website[]=sentence2.split("\\.");
		for(String s:st)
			System.out.println(s);
		for(String w:website)
			System.out.println(w);
		
		//using pattern regex
		Pattern p = Pattern.compile("\\s");
		String words[]=p.split(sentences);
		for(String s:words)
			System.out.println(s);
		Pattern p2 = Pattern.compile("\\.");
		String websites[]=p2.split(sentence2);
		for(String w:websites)
			System.out.println(w);
		
		//s - split the words by spaces
		//. - split the words by dot
	}
}