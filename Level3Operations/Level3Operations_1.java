import java.util.ArrayList;
import java.util.Scanner;

public class Level3Operations_1 {
	  static Scanner sc = new Scanner(System.in);
	  public static void main(String[] args) 
	  {
		  Module1 book = new Module1();
		  book.templateMethod();
		}
}
 class Library
{
	  static Scanner sc = new Scanner(System.in);
    Library(int bookID,String BookName,int bookPrice,String BookContent)
    {
        this.BookID=bookID;
        this.BookName=BookName;
        this.BookPrice=bookPrice;
        this.BookContent=BookContent;
    }
    
    String BookName;
    int BookID;
    int BookPrice;
    String BookContent;
	public String toString()
	{
		return "\t"+BookID+"\t"+BookName+"\t\t"+BookPrice+"\t\t"+BookContent;
	}
	
}
class Module1 {
	   Scanner sc = new Scanner(System.in);
	   ArrayList<Library> Book = new ArrayList<>();
		static int j=1;
	public void add()
	{
		System.out.println("How many books you want to add : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
			
            System.out.println("\nEnter a BookName : ");
            String Bookname = sc.nextLine();
            Bookname = sc.nextLine();
            
            System.out.println("\nEnter a BookContent : ");
            String BookContent = sc.nextLine();
			
           // BookContent = sc.nextLine();
			System.out.println("\nEnter a BookPrice : ");
            int bookprice = sc.nextInt();
            Library book = new Library(j,Bookname,bookprice,BookContent);
			Book.add(book);
			j++;
        }
	}
	public void view()
	{
		
		//System.out.println("How many Books you want to view :");
		
		//int view =sc.nextInt();
		System.out.println("\tBookID\tBookName\tBookPrice\tBookContent");
		for(int i=0;i<Book.size();i++)
		{
			System.out.println(Book.get(i));
		}
	}
	public void update()
	{
		System.out.println("Enter a BookID that you want to update  :");
		int bid = sc.nextInt();
		for(Library o:Book){
			if(bid==o.BookID){
				//Book.remove(o);
				System.out.println("1.BookName 2.BookPrice 3.BookContent");
				int n = sc.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("Enter a Book Name :");
						String bookName = sc.next();
						o.BookName=bookName;
						break;
					case 2:
						System.out.println("Enter a Book prices :");
						int  bookPrices= sc.nextInt();
						o.BookPrice=bookPrices;
						break;
					case 3:
						System.out.println("Enter a Book Content :");
						String bookContent = sc.next();
						o.BookContent=bookContent;
						System.out.println("updated sucessfully");
						break;
				}
		}
	}		
	}
	public void delete()
	{
		System.out.println("Enter a BookID that you want to remove :");
		int bid = sc.nextInt();
		for(Library o:Book){
			if(bid==o.BookID){
				Book.remove(o);
				System.out.println("Removed sucessfully");
				break;
			}
		}
		
	}
	public void templateMethod()
	{
		try{
		int n =0;
		Module1 lib = new Module1();
		do{
			System.out.println("1.add 2.view 3.Update 4.Delete 5.Exit");
			n = sc.nextInt();
			switch(n)
			{
			case 1:
				lib.add();
				break;
			case 2:
				lib.view();
				break;
			case 3:
				lib.update();
				break;
			case 4:
				lib.delete();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Try Again");
		}
		}while(n != 6);
		}
		catch(Exception e)
		{
			System.out.println("Try again");
			Module1 lib1 = new Module1();
			lib1.templateMethod();
			
		}
	}
}