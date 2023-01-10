import java.util.*;
import java.util.regex.*;
public class Parking_Management
{
    ArrayList<String> Adminusername = new ArrayList<String>();
    ArrayList<String> Adminpassword = new ArrayList<String>();
    ArrayList<String> Uusername = new ArrayList<String>();
    ArrayList<String> Upassword = new ArrayList<String>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Parking_Management parking_management = new Parking_Management();
        parking_management.Login();
		 parking_management.view();
        
    }
    public void Login()
    {
        int n=0;
        do
        {
            System.out.println("1.Admin 2.User 3.Exit");
            n = sc.nextInt();
            switch(n)
            {
                case 1:
                    adminLogin();
                    break;
                case 2:
                    userLogin();
                    break;
            }
        }while(n != 3);
    }
    public void adminLogin()
    {
        int check = 0;
        do
        {
            System.out.println("1.SignUp 2.SignIn 3.Exit");
            check = sc.nextInt();
            switch(check)
            {
                case 1:
                    AsignUp();
                    break;
                case 2:
                    AsignIn();
                    break;
            }
        }while(check != 3);
    }
    public void userLogin()
    {
        int check = 0;
        do
        {
            System.out.println("1.SignUp 2.SignIn 3.Exit");
            check = sc.nextInt();
            switch(check)
            {
                case 1:
                    UsignUp();
                    break;
                case 2:
                    UsignIn();
                    break;
            }
        }while(check != 3);
    }
    public void AsignUp()
    {
        System.out.println("Enter a UserName :");
        String Username = sc.next();
        Adminusername.add(Username);
        System.out.println("Enter a Password :");
        String password = sc.next();
        if(checkPassword(password))
        {
            Adminpassword.add(password);
            System.out.println("Login Sucessfully");
        }
        else
        {
            System.out.println("Try Again");
            AsignUp();
        }

    }
    public void AsignIn()
    {
        int count = 0;
        System.out.println("Enter a UserName :");
        String Username = sc.next();
        System.out.println("Enter a Password :");
        String password = sc.next();
        for(int i=0;i<Adminusername.size();i++)
        {
            if(Username.equals(Adminusername.get(i)))
            {
                count++;
            }
        }
        for(int i=0;i<Adminpassword.size();i++)
        {
            if(password.equals(Adminpassword.get(i)))
            {
                count++;
            }
        }
        if(count == 2)
        {
            System.out.println("SignIn Sucessfully ");
            count = 0;
        }


    }
    public void UsignUp()
    {
        System.out.println("Enter a UserName :");
        String Username = sc.next();
        Uusername.add(Username);
        System.out.println("Enter a Password :");
        String password = sc.next();
        if(checkPassword(password))
        {
            Upassword.add(password);
            System.out.println("Login Sucessfully");
        }
        else
        {
            System.out.println("Try Again");
            UsignUp();
        }

    }
    public void UsignIn()
    {
        int count = 0;
        System.out.println("Enter a UserName :");
        String Username = sc.next();
        System.out.println("Enter a Password :");
        String password = sc.next();
        for(int i=0;i<Uusername.size();i++)
        {
            if(Username.equals(Uusername.get(i)))
            {
                count++;
            }
        }
        for(int i=0;i<Upassword.size();i++)
        {
            if(password.equals(Upassword.get(i)))
            {
                count++;
            }
        }
        if(count == 2)
        {
            System.out.println("SignIn Sucessfully ");
            count = 0;
        }


    }
    private boolean checkPassword(String password)
    {
        String regex="^(?=.*[a-z])+(?=.*[0-9])+(?=.*[A-Z])+(?=.*[!@#$%&*%])+(?=[\\S+$]).{8,20}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(password);
        boolean var=m.matches();
        return var;


    }
	private void view()
	{
		System.out.println("Enter a Admin name :");
		String adminname = sc.next();
		System.out.println("Enter a Admin password :");
		String adminpassword = sc.next();
		if(adminname.equals("admin") && adminpassword.equals("admin123"))
		{
			System.out.println("Login Sucessfully");
			System.out.println("Enter 1.Admin username and password 2. user username and password ");
			int n = sc.nextInt();
			switch(n)
			{
				case 1:
					System.out.println("Admin name");
					for(int i=0;i<Adminusername.size();i++)
					{
						System.out.println(Adminusername.get(i));
					}
					System.out.println("Admin password");
					for(int i=0;i<Adminpassword.size();i++)
					{
						System.out.println(Adminpassword.get(i));
					}
				break;
				case 2:
					System.out.println("Username");
					for(int i=0;i<Uusername.size();i++)
					{
						System.out.println(Uusername.get(i));
					}
					System.out.println("User password");
					for(int i=0;i<Upassword.size();i++)
					{
						System.out.println(Upassword.get(i));
					}
				break;
					
				}
			
		}
		
	}

}
class CarParking
{
	int Parking Fees;
	String Types;
	int Duration;
	int Customers;
	String Parking_Slots;
}