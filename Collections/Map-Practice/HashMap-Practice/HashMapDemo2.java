import java.util.HashMap;
import java.util.Scanner;
class HashMapDemo2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> TelephoneDirectory = new HashMap<String,String>();
		System.out.println("Enter a how many phone numbers to print :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter your name : ");
			String name = sc.next();
			System.out.println("Enter your phone Number : ");
			String phonenumber = sc.next();
			TelephoneDirectory.put(name,phonenumber);
		}
		System.out.println("Enter your name : ");
		String name = sc.next();
		System.out.println(name+" phone number is "+TelephoneDirectory.get(name));
		System.out.println(name+" phone number is "+TelephoneDirectory.getOrDefault(name,"Wrong Number"));
	
	
	}
}