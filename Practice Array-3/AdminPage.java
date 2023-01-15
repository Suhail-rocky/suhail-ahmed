package day2;

import java.util.*;
 class AdminPage{
	static String UserName;
	static String PassWord;
	String[] bookname=new String[10];
	int[] bookprice=new int[10];
	int[] bookid=new int[10];
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
	System.out.println("Enter the BookName : ");
	System.out.println("Enter the BookPrice : ");
	System.out.println("Enter the BookID : ");
	for(int i=0;i<n;i++)
	{
	bookname[i]=sc.next();
	bookprice[i]=sc.nextInt();
	bookid[i]=sc.nextInt();
	}
	}
	public void view(){
	System.out.println("The Book Name are : ");
	for(int i=0;i<n;i++)
	{
	System.out.println(bookname[i]+" "+bookprice[i]+" "+bookid[i]);
	}
	}
	public void delete(){
		/*int[] arr = new int[]{1,2,3,4,5};
        int[] arr_new = new int[arr.length-1];
        int j=3;
        for(int i=0, k=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));

    }*/
		
	}
	public void update(){
		int arr[] = {1,2,3,4,5,6};  
		int n = arr.length;  
		int newArr[] = new int[n+1];  
		int value = 7;  
		for(int i=0;i<n;i++)
		System.out.println(arr[i]);  
		for(int i = 0; i<n; i++) {  
		newArr[i] = arr[i];  
		}  
		newArr[n] = value;  
		for(int i=0;i<n;i++)
			System.out.println(newArr[i]);  
		
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

