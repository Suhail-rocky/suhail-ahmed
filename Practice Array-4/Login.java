import java.util.Scanner;

public class Login {
	static String UserName;
	static String PassWord;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter 1.Signup" +
					 "2.Signin");
		switch(a){
		case 1:
			System.out.println("Enter your username :");
			UserName=sc.next();
			System.out.println("Enter your password : ");
			System.out.print(
	                "1. A password must have at least eight characters.\n" +
	                "2. A password consists of only letters and digits.\n" +
	                "3. A password must contain at least two digits \n" +
	                "Input a password (You are agreeing to the above Terms and Conditions.): ");
			PassWord=sc.next();
			 if(UserName.equals("suhail") && PassWord.equals("123"))
		        {
		            System.out.println("Authentication Successful");
		        }
		        else
		        {
		            System.out.println("Authentication Failed");
		        }
			break;

		}
		
			

	}

}
