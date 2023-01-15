import java.util.*;
class AdminPage{
	static String UserName;
	static String PassWord;
//sign up
public static void signup()
				{
					Scanner sc = new Scanner(System.in);
				System.out.println("Enter your username :");
				UserName=sc.next();
				System.out.println("Enter your password : ");
				PassWord=sc.next();
				System.out.println("Again Enter your password :");
				String conpassword=sc.next();
				if(PassWord.equals(conpassword)){
					System.out.println("Authentication Sucessful ");
				}
					else
					{
						System.out.println("Authentication Failed Try Again!");
					}
				}
//sign in
			public static void signin(){
				Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your username :");
			String Username=sc.next();
			System.out.println("Enter your password : ");
			String Password=sc.next();
			if(UserName.equals(Username) && PassWord.equals(Password))
			{
				System.out.println("Go the Next page :)");
			}
	        else
	        {
	            System.out.println("Authentication Failed");
	        }
			}
		}
public class LoginFormDemos extends AdminPage{
public static void main(String args[])
{
LoginFormDemos form = new LoginFormDemos();
AdminPage.signup();
AdminPage.signin();
}
}
