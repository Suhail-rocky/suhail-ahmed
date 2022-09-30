import java.util.*;
 class AdminPage{
	static String UserName;
	static String PassWord;
	String[] bookname=new String[10];
	int[] bookprice=new int[10];
	int[] bookcount=new int[10];
	int n;
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
				//UserName = admin
				//password = admin123
			
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
	public void add(){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of books you want to store : ");
	n = sc.nextInt();
	for(int i=0;i<n;i++)
	{
	System.out.println("Enter the BookName : ");
	bookname[i]=sc.next();
	System.out.println("Enter the BookPrice : ");
	bookprice[i]=sc.nextInt();
	System.out.println("Enter the BookID : ");
	bookcount[i]=sc.nextInt();
	}
	}
	public void view(){
	System.out.println("The Book Name are : ");
	for(int i=0;i<n;i++)
	{
	System.out.println(i+"\t"+bookname[i]+"\t"+bookprice[i]+"\t"+bookcount[i]);
	}
	}
	public void delete(){
		
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Serial Number to delete : ");
		int delete = sc.nextInt();
		bookname[delete]="null";
		bookprice[delete]=0;
		bookcount[delete]=0;
		for(int i=delete;i<bookprice.length-1;i++){
			String temp = bookname[i];
			bookname[i]=bookname[i+1];
			bookname[i+1]=temp;
			
			int temps = bookprice[i];
			bookprice[i]=bookprice[i+1];
			bookprice[i+1]=temps;
			
			int tempo = bookcount[i];
			bookcount[i]=bookcount[i+1];
			bookcount[i+1]=tempo;
		}
	}
	public void update(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter option to update 1.bookname 2.bookprice 3.bookcount");
		int n = sc.nextInt();
		System.out.println("Enter the book serial to update ");
		int m = sc.nextInt();
		switch(n){
			case 1:
			System.out.println("Enter the book name"+m);
			bookname[m]=sc.next();
			break;
			case 2:
			System.out.println("Enter the book price"+m);
			bookprice[m]=sc.nextInt();
			break;
			case 3:
			System.out.println("Enter the book count"+m);
			bookcount[m]=sc.nextInt();
			break;
		}
	}
	public void exit(){
		System.exit(0);
	}
public static void main(String args[])
{
LoginFormDemos form = new LoginFormDemos();
System.out.println("Enter 1.signup || 2.signin");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
switch(a){
case 1:
	AdminPage.signup();
	break;
case 2 :
	AdminPage.signin();
	break;
	default :
		System.out.println("Invalid ! try Again :)");
}
int c = sc.nextInt();

boolean flag = true;
while(flag){
System.out.println("Enter 1.add || 2.view || 3.delete || 4.update || 5.exit");
int b = sc.nextInt();
switch(b){
case 1:
	form.add();
	break;
case 2 :
	form.view();
	break;
case 3:
	form.delete();
	break;
case 4:
	form.update();
	break;
case 5:
	form.exit();
	break;
	default :
		System.out.println("Try Again :)");
}
}
}
}
