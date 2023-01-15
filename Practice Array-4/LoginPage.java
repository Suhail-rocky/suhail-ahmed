import java.util.Scanner;

public class LoginPage {
	static String UserName;
	static String PassWord;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1.Admin Page" +
		 			 "2.User Page");
		int a = sc.nextInt();
		switch(a){
		case 1:
			//admin page
			System.out.println("Enter 1.Signup" +
			 			 "2.Signin");
			int b = sc.nextInt();
			switch(b){
			
			case 1://sign up
				signup();
				break;
				
			case 2:
				//signin
				signin();
				break;
			}
		case 2:
			//user page
			System.out.println("Enter 1.Signup" +
						 "2.Signin");
			int c = sc.nextInt();
			switch(c){
			
			case 1://sign up
				signup();
				break;
				
			case 2:
				//signin
				signin();
				break;
			}
			}}
			
				
				
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
				char arr[];
				arr=PassWord.toCharArray();
				/*for(int i = 0;i<arr.length;i++)
				{
					if(arr[i] <= 65 || arr[i] >= 90 && arr[i] == 45 && arr[i] == 64){
						System.out.println(arr[i]);
						
					}
				}*/
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
