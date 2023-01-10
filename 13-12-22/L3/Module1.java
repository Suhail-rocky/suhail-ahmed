import java.util.*;
public class Module1
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		Admin a = new Admin(); 
		a.doWork();
		
	}
}
abstract class Library{
	public abstract void add();
	public abstract void view();
	public abstract void update();
	public abstract void delete();
}
class Admin extends Library{
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> bookid = new ArrayList<Integer>(); 
	static ArrayList<String> bookname = new ArrayList<String>(); 
	static ArrayList<Integer> bookprice = new ArrayList<Integer>(); 
	public void add()
	{
		System.out.println("How many books you wnts to add ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter book id");
			int bookids = sc.nextInt();
			bookid.add(bookids);
			System.out.println("Enter book name");
			String booknames = sc.next();
			bookname.add(booknames);
			System.out.println("Enter book price");
			int bookprices= sc.nextInt();
			bookprice.add(bookprices);
		}
		
		
	}
	public void view()
	{
		System.out.println("How many books you wants to view ");
		int n=sc.nextInt();
		System.out.println("\tBook Serial No\tBookID\tBookName\tBookPrice");
		for(int i=0;i<n;i++)
		{
		System.out.println("\t"+(i+1)+"\t"+bookid.get(i)+"\t"+bookname.get(i)+"\t\t"+bookprice.get(i));
		}
		
	}
	public void update()
	{
		System.out.println("How many books you wants to update ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter 1.BookID 2.BookName 3.BookPrice");
			int index = sc .nextInt();
			switch(index)
			{
				case 1:
					System.out.println("Enter a book Serial number :");
					int sno = sc.nextInt();
					System.out.println("Enter book Id :");
					int bid = sc.nextInt();
					bookid.set(sno-1,bid);
					break;
				case 2:
					System.out.println("Enter a book Serial number :");
					sno = sc.nextInt();
					System.out.println("Enter book name :");
					String bname = sc.next();
					bookname.set(sno,bname);
					break;
				case 3:
					System.out.println("Enter a book Serial number :");
					sno = sc.nextInt();
					System.out.println("Enter book price :");
					int bprice = sc.nextInt();
					bookid.set(sno,bprice);
					break;
			}

		}
			
	}
	public void delete()
	{
		System.out.println("Enter  a no of books you want to Delete :");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the book Serial no:");
			int bid=sc.nextInt();
			bookname.remove(bid);
			bookid.remove(bid);
			bookprice.remove(bid);
		}
			
		
	}
	public void doWork()
	{
		Admin a1 = new Admin(); 
		System.out.println("Enter 1.add 2.view 3.update 4.delete");
		int select = sc.nextInt();
		switch(select)
		{
			case 1:
				a1.add();
				break;
			case 2:
				a1.view();
				break;
			case 3:
				a1.update();
				break;
			case 4:
				a1.delete();
				break;
		}
		System.out.println("Do you want to continue Yes or No");
		String check =sc.next();
		if(check.equals("Yes"))
		{
			a1.doWork();
		}
	}
		
	}
