import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
class PasswordValidationUsingFile
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\Regex practice\\Password.txt");
		Scanner sc = new Scanner(file);
		boolean linePresent = sc.hasNext();
		while(linePresent)
		{
			String word = sc.next();
			int i = word.lastIndexOf(":");
			String password=word.substring(i+1);
			Pattern p = Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@%#$]).{8,20})");
			Matcher m =p.matcher(password);
			if(m.find())
				System.out.println(m.group() + " is valid password");
			else
				System.out.println(password + " is not valid password ");
			linePresent = sc.hasNext();
		}
	}
}