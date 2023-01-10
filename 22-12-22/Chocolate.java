import java.util.*;

class Chocolate {

	static int countMaxChoco(int mittai,int price, int wrap)
	{
		if (mittai < price)
			return 0;
		int choc = mittai / price;
		choc = choc + (choc - 1) / (wrap - 1);
		return choc;
	}
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of chocolates : ");
		int mittai=sc.nextInt();
		System.out.println("Enter a price : ");
		int price=sc.nextInt();
		System.out.println("Enter a return wrappers to return a chocolate : ");
		int wrap=sc.nextInt();
		
	
		System.out.println(countMaxChoco(mittai, price, wrap));
	}
}


