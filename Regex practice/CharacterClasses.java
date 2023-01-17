 import java.util.regex.Pattern;
 import java.util.regex.Matcher;
 class CharacterClasses
 {
	public static void main(String[] args)
	{
		String s = "abcbcaacbaabbcc";
		Pattern p =Pattern.compile("[abc]");
		Matcher m=p.matcher(s);
		while(m.find())
		{
			System.out.println(m.group()+"starts at "+m.start());
		}
		String s1="aA1";
		Pattern p1 =Pattern.compile("[a-zA-Z0-9]");
		Matcher m1=p1.matcher(s1);
		while(m1.find())
		{
			System.out.println(m1.group()+"starts at "+m1.start());
		}
		String s2="aA1!@#$%^&*()";
		Pattern p2 =Pattern.compile("[^a-zA-Z0-9]");
		Matcher m2=p2.matcher(s2);
		while(m2.find())
		{
			System.out.println(m2.group()+"starts at "+m2.start());
		}
	}
 }