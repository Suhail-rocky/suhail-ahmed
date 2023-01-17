import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class ValidMobileNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a mobile Number :");
		String mobilenumber = sc.next();
		Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher m=p.matcher(mobilenumber);
		if(m.find())
		{
			System.out.println(m.group()+" is a valid mobile number "); 
		}
		else
		{
			System.out.println(m.group()+" is a not a valid mobilenumber");
		}
	}
}