import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
class EmailIDUsingFile
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\Regex practice\\Emailid.txt");
		Scanner sc = new Scanner(file);
		boolean linePresent = sc.hasNext();
		while(linePresent)
		{
			String word = sc.next();
			int i = word.lastIndexOf(":");
			String mail=word.substring(i+1);
			Pattern p = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@"+"(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
			Matcher m =p.matcher(mail);
			if(m.find())
				System.out.println(m.group() + " is valid mail ID ");
			else
				System.out.println(mail + " is not a mail ID ");
			linePresent = sc.hasNext();
		}
	}
}