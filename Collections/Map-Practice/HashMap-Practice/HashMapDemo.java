import java.util.HashMap;
import java.util.Scanner;
public class HashMapDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,String> BookDetails = new HashMap<Integer,String>();
		System.out.println("Enter a number of Books : ");
		int n = sc.nextInt();
		boolean empty = BookDetails.isEmpty();
		System.out.println("is HashMap empty : "+empty);
		//add
		int bid=1001;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a Book Name : ");
			String bookName=sc.next();
			BookDetails.put(i+bid,bookName);
		}
		System.out.println("No of Books are : "+BookDetails.size());
		System.out.println("Updated books are : "+BookDetails);
		BookDetails.remove(1002,"python");
		BookDetails.remove(1001);
		BookDetails.replace(1003,"C++");
		BookDetails.replace(1004,"VB","DotNet");
		System.out.println("Updated books are : "+BookDetails);
	}
}