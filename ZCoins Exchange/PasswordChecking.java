import java.util.*;
public class PasswordChecking
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Password :");
		String password = sc.next();
		System.out.println(checkPassword(password));
		
	}
	private static boolean checkPassword(String password)
    {
        char c[] = password.toCharArray();
        if(c.length>8)
        {
            String regex="^(?=.[a-z])+(?=.[0-9])+(?=.[A-Z])+(?=.[!@#$%&*%])+(?=[\\S+$]).{8,20}$";
            Pattern p=Pattern.compile(regex);
            Matcher m=p.matcher(password);
            boolean var=m.matches();
            return var;
        }
        else
        {
            ZCoinExchange passtry = new ZCoinExchange();
            System.out.println("Try again");
            passtry.createAccount();
        }
        return true;
    }
}