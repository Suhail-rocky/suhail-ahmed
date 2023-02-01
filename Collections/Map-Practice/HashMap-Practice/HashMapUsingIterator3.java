import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
//using forEachLoop
class HashMapUsingIterator3
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
		//keys
		for(String products:shoppingCart.keySet())
			System.out.println("products : "+products);
		//values
		for(String price:shoppingCart.values())
			System.out.println("Prices : "+price);
		//keys-values
		System.out.println("products price");
		for(Entry<String,String> shop : shoppingCart.entrySet())
			System.out.println(shop.getKey()+"\t"+shop.getValue());
		//Using Lambda
		System.out.println("products price");
		shoppingCart.forEach((k,v) -> System.out.println(k+"\t"+v));
		
	}
}