
import java.util.Scanner;

public class Loginmodules {
	 String UserName;
	 String PassWord;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1.Admin Page" +
		 			 "2.User Page");
		int a = sc.nextInt();
		switch(a){
		case 1:
			System.out.println("Enter 1.Signup" +
			 			 "2.Signin");
			int b = sc.nextInt();
			switch(b){
			case 1:
				System.out.println("Enter your username :");
				String UserName=sc.next();
				System.out.println("Enter your password : ");
				String PassWord=sc.next();
				int PASSWORD_LENGTH =8;
				if(PASSWORD_LENGTH<=8)
					System.out.println("Account is created");
				else
					System.out.println("Invalid! try again");
				break;				
			}
			break;
			
		case 2:
			System.out.println("Enter your username :");
			String Username=sc.next();
			System.out.println("Enter your password : ");
			String Password=sc.next();
			if(Username.equals(Username) && Password.equals(Password))
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
