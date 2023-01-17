import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
class ValidMobileNoUsingFile
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\Regex practice\\MobileNumber.txt");
		Scanner sc = new Scanner(file);
		boolean linePresent = sc.hasNext();
		while(linePresent)
		{
			String word = sc.next();
			int i = word.lastIndexOf(":");
			String mobile=word.substring(i+1);
			Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
			Matcher m =p.matcher(mobile);
			if(m.find())
				System.out.println(m.group() + " is valid mobile no ");
			else
				System.out.println(mobile + " is not a valid mobile no ");
			linePresent = sc.hasNext();
		}
	}
}