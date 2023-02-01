import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
class HashMapUsingIterator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> shoppingCart = new HashMap<>();
		System.out.println("Enter a number of items : ");
		int items = sc.nextInt();
		for(int i=0;i<items;i++)
		{
			System.out.println("Enter a product name : ");
			String pname = sc.next();
			System.out.println("Enter a product price : ");
			String price = sc.next();
			shoppingCart.put(pname,price);
		}
		Iterator<Entry<String,String>> itr = shoppingCart.entrySet().iterator();
		System.out.println("The products are :");
		while(itr.hasNext())
		{
			Object key = itr.next();
			System.out.println(key);
		}
		//another way 
		Iterator<String> itr2 = shoppingCart.keySet().iterator();
		System.out.println("The Shopping products are : ");
		while(itr2.hasNext())
		{
			Object keyView = itr2.next();
			System.out.println(keyView);
		}
		Iterator<String> itr3 = shoppingCart.values().iterator();
		System.out.println("The prices are : ");
		while(itr3.hasNext())
		{
			Object valuesView = itr3.next();
			System.out.println(valuesView);
		}
	}
}