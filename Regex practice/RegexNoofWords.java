import java.util.regex.Matcher;
import java.util.regex.Pattern;
class RegexNoofWords
{
	public static void main(String[] args)
	{
		String sentence="thupparku thupaiya thuppaki thupparku thuppaiya thoovum malai";
		Pattern p = Pattern.compile("thuppar");
		Matcher m = p.matcher(sentence);
		int words=0;
		while(m.find())
		{
			words++;
			System.out.println(m.group()+"starts at "+m.start()+"and ends at "+m.end());
		}
		System.out.println("thuppar appears "+words+" times");
	}
}