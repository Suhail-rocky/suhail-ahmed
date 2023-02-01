import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
class HashMapUsingIterator2
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
		//another way 
		Iterator<String> itr2 = shoppingCart.keySet().iterator();
		Iterator<String> itr3 = shoppingCart.values().iterator();
		System.out.println("Products\tPrices");
		while(itr2.hasNext()&&itr3.hasNext())
		{
			Object keyView = itr2.next();
			Object valuesView = itr3.next();
			System.out.println(keyView+"\t"+valuesView);
		}
		itr2.remove();
		while(itr2.hasNext()&&itr3.hasNext())
		{
			Object keyView = itr2.next();
			Object valuesView = itr3.next();
			System.out.println(keyView+"\t"+valuesView);
		}
		
	}
}