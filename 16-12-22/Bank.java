import java.util.*;
import java.util.regex.*;
public class Bank
{
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Customer> customer = new ArrayList<Customer>();
	public static void main(String[] args)
	{
		
		Bank bank = new Bank();
		bank.addNewCustomer();
		System.out.println(customer);
		
	}
	public void addNewCustomer()
	{
		Bank b = new Bank();
		int k=1;
		Customer cust = new Customer();
		cust.custID=k*1+11;
		cust.accountno=k*1+11*10000;
		cust.Balance=10000;
		System.out.println("Enter your Name : ");
		cust.name = sc.next();
		System.out.println("Enter your Password : ");
		cust.password = sc.next();
		cust.EncryptPassword= b.checkPassword(cust.password);
		k++;
		
	}
	private String checkPassword(String p1)
	{
		Bank b = new Bank();
		boolean check = b.validatePassword(p1);
		if(check)
		{
			return b.changeToencryption(p1);
		}
		else
		{
			System.out.println("try Again Enter a password ");
			String pass = sc.next();
			b.checkPassword(pass);
		}
		return b.changeToencryption(p1);
			
	}

	private boolean validatePassword(String p1)
	{
		 boolean check;
        String passwords ="^(?=.*[0-9])" + "(?=.*[a-z])" + "(?=.*[A-Z])"+"(?=.*[@#$%^&*])"+"(?=\\S+$).{6,10}";
        Pattern p = Pattern.compile(passwords);
        Matcher m = p.matcher(p1);
        check=m.matches();
        return check;
		
	}
	private String changeToencryption(String encrypt)
	{
		 String changepasswordToEncrypy="";
        char encryptpass[] =encrypt.toCharArray();
        for(int i=0;i<encrypt.length();i++)
        {
            encryptpass[i]=(char)(encrypt.charAt(i)+1);
        }
        for(int i=0;i<encryptpass.length;i++)
        {
            changepasswordToEncrypy +=encryptpass[i];
        }

        return changepasswordToEncrypy;
    }
	
}

class Customer
{
	String name;
	int custID;
	String password;
	String EncryptPassword;
	String DecryptPassword;
	int accountno;
	int Balance;
	public String toString()
	{
		return " "+name+""+custID+" "+EncryptPassword+" "+accountno+" "+Balance;
	}
}