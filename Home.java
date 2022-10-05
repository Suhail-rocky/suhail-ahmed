import java.util.*;
public class Home {
public static void main(String[] args){
	Admin myObj = new Admin();
	Book Objmy = new Book();
	Scanner scan = new Scanner(System.in);
	System.out.println("Welcome to Online Book Store");
	System.out.println("1>Admin");
	System.out.println("2>User");
	int userChoice = scan.nextInt();
	switch(userChoice){
		case 1:
		myObj.Admin1();
		break;
		case 2:
	    Objmy.User();
		break;
		default:
		System.out.println("!!Input Error!!");
		scan.close();
	}
	}
}
class Admin extends AdminMenu{
	public void Admin1(){
		Scanner scan = new Scanner(System.in);
		String AdminUserName = "Suhail";
		String AdminPassWord = "Suhail123";
		System.out.print("Enter the Admin UserName: ");
		String AdminId = scan.nextLine();
		System.out.print("Enter the Admin Password: ");
		String AdminPass = scan.nextLine();
		if(AdminUserName.equals(AdminId)&&AdminPassWord.equals(AdminPass))
		{
		System.out.println("Welcome to "+AdminId);
		//AdminMenu myobj = new AdminMenu();
		AdminClsMenu();
		}
		else{
			System.out.println("Sorry!! This is a not Admin ID and Password");
			Home.main(null);
		}
		scan.close();
	}
	
}
class AdminMenu{
	public void AdminClsMenu(){
		Book myAdmin = new Book();
		Home myAdmin1 = new Home();
		Scanner scan = new Scanner(System.in);
		System.out.println("1>Add Books");
		System.out.println("2>View");
		System.out.println("3>Update");
		System.out.println("4>Delete");
		System.out.println("5>Sign Out");
		int userChoice = scan.nextInt();
		switch(userChoice){
		case 1:
		myAdmin.Add();
		break;
		case 2:
		myAdmin.View();
		break;
		case 3:
		myAdmin.Update();
		break;
		case 4:
		myAdmin.Delete();
		break;
		case 5:
		myAdmin1.main(null);
		break;
		default:
		System.out.println("!!Input Error!!");
		AdminClsMenu();
		}
	}
}
class Book {
	static Scanner scan = new Scanner(System.in);
	static int BookId[] = new int[50];
	static String BookNames[]= new String[50];
	//String BookContent[] = new String[100];
	static int BookPrice[]=new int[50];
	static int BookCount[]=new int[50];
	static int k=0,total,i,j;
	 int usercount=0;
	public static void Add(){
		//int total,i;
		//Book MyBookAdd=new Book();
		System.out.println("Enter the Book count");
		total=scan.nextInt();
		for(i=0;i<total;i++){
			System.out.println("Enter Book Id: ");
			BookId[k]=scan.nextInt();
			System.out.println("Enter Book Name: ");
			BookNames[k]=scan.next();
			//System.out.println("Enter Book Content: ");
			//BookContent[k]=scan.next();
			System.out.println("Enter Book Price: ");
			BookPrice[k]=scan.nextInt();
			System.out.println("Enter Book Stock Count: ");
			BookCount[k]=scan.nextInt();
			k++;
			System.out.println((i+1)+"Book SuccessFully Added...");
		}
		
		AdminMenu obj=new AdminMenu(); 
		    obj.AdminClsMenu();
	}
	public static void View(){
		//Book ViewBook = new Book();
		System.out.println("Welcome to view");
		for(j=0;j<BookNames.length;j++){
			if(BookCount[j]!=0){
				System.out.println("Book Id       BookNames       BookPrice       StockCount");
				System.out.println("   "+BookId[j]+"            "+BookNames[j]+"            "+BookPrice[j]+ "              "+BookCount[j]);
			}
		}
			AdminMenu obj1=new AdminMenu(); 
		   obj1.AdminClsMenu();
	}
	public static void Update(){
		System.out.print("Welcome to Update Details");
		System.out.println("Enter the Book Id:");
		int UpdateValue = scan.nextInt();
		if(BookId[UpdateValue-1]!=0){
				System.out.println("Book Id       BookNames       BookPrice       StockCount");
				System.out.println("   "+BookId[UpdateValue-1]+"            "+BookNames[UpdateValue-1]+"            "+BookPrice[UpdateValue-1]+ "            "+BookCount[UpdateValue-1]);
			}
			System.out.println("Which one You Update");
			System.out.println("1>Book Name");
			System.out.println("2>Book Price");
			System.out.println("3<Book Count");
			int UpdateNo =scan.nextInt();
			AdminMenu obj2=new AdminMenu(); 
			switch(UpdateNo){
			case 1:
			BookNames[UpdateValue-1]=scan.next();
			
		    obj2.AdminClsMenu();
			break;
			case 2:
			BookPrice[UpdateValue-1]=scan.nextInt(); 
		    obj2.AdminClsMenu();
			break;
			case 3:
			BookCount[UpdateValue-1]=scan.nextInt();
		    obj2.AdminClsMenu();
			break;
			default :
			System.out.print("Invalid Input!!!");
			Update();
			}
	}
	public void Delete(){
		AdminMenu obj3=new AdminMenu();
		System.out.print("Welcome to Delete");
		System.out.println("Enter the Delete Book Id:");
		int DeleteVal = scan.nextInt();
		if(BookId[DeleteVal-1]!=0){
				System.out.println("Book Id       BookNames       BookPrice       StockCount");
				System.out.println("   "+BookId[DeleteVal-1]+"            "+BookNames[DeleteVal-1]+"            "+BookPrice[DeleteVal-1]+ "            "+BookCount[DeleteVal-1]);
			}
			System.out.println("1>Delete");
			int DeleteValue = scan.nextInt();
			if(DeleteValue == 1){
				BookId[DeleteVal-1]=BookId[DeleteVal];
				BookNames[DeleteVal-1]=BookNames[DeleteVal];
				BookPrice[DeleteVal-1]=BookPrice[DeleteVal];
				BookCount[DeleteVal-1]=BookCount[DeleteVal];
				BookNames[DeleteVal]="0";
				BookId[DeleteVal]=0;
				BookPrice[DeleteVal]=0;
				BookCount[DeleteVal]=0;
			}
			 obj3.AdminClsMenu();
	}
	String UserId[] = new String[50];
	String UserPassword[] = new String[50];
	public void User() {
		System.out.println("Welcome to User...");
		System.out.println("1>Sign Up");
		int userInput;
		userInput=scan.nextInt();
		switch(userInput) {
		case 1:
			SignUp();
			break;
			default :
				System.out.println("Invalid Input !!!!!");
		}
	}
	public void SignUp() {
		
		for(i=0;i<UserId.length;i++) {
		System.out.println("Enter the User Id");
			UserId[usercount]=scan.next();
		System.out.println("Enter the User PassWord .... Password Upto 8 character And Aleast One Cap Letter....");
			UserPassword[usercount]=scan.next();
			if(UserId[usercount]!= "") {
				i++;
				char arr[] = UserPassword[usercount].toCharArray();
				for(j=0;j<arr.length;j++) {
				if(arr.length>8 && arr[j]>=65 || arr[j]<=90 && arr[j]==64) {
					System.out.println("Signed Up SuccessFully!!!");
//					for(int z=0;z<50;z++) {
//						System.out.println(UserId[z]+" " + UserPassword[z]);
//					}
					usercount++;
				}
				else {
					System.out.println("enter pass is not Valid!!!!");
					SignUp();
				}
				System.out.println("1>Sign In");
				System.out.println("2>Sign Up");
				int userOption;
				userOption=scan.nextInt();
				switch(userOption) {
				case 1:
					SignIn();
					break;
				case 2:
					SignUp();
					default :
						System.out.println("invalid Input");
						SignUp();
				}
				}
			}
		}
	}
	public void SignIn() {
		Home myObjHome=new Home();
		System.out.println("welcome to Sign In");
		System.out.println("Enter the USer Id: ");
		String userid = scan.next();
		System.out.println("Enter the USer Pssword: ");
		String userpass=scan.next();
		for(i=0;i<UserId.length;i++) {
			System.out.println(UserId[i]+" " + UserPassword[i]);
			if(UserId[i]!="0" && userid.equals(UserId[i]) && userpass.equals(UserPassword[i])) {
				System.out.println("1>view");
				//System.out.println("2>Buy");
				System.out.println("2>Sign Out");
				int userinput;
				userinput=scan.nextInt();
				switch(userinput) {
				case 1:
					UserView();
					break;
				case 2 :
					myObjHome.main(null);
					default :
						System.out.println("Invalid Input...");
						SignIn();
				}
			}
		}
	}
	public void UserView() {
		System.out.println("Welcome to View..");
		for(j=0;j<BookNames.length;j++){
			if(BookCount[j]!=0){
				System.out.println("Book Id       BookNames       BookPrice");
				System.out.println("   "+BookId[j]+"            "+BookNames[j]+"            "+BookPrice[j]);
			}
		}
		System.out.println("If You Want Buy any Book....");
		System.out.println("1>yes....");
		System.out.println("2>No :~) ");
		int input;
		input = scan.nextInt();
		switch(input) {
		case 1:
			Buy();
			break;
		case 2:
		SignIn();
		break;
		default:
			System.out.println("Invalid Input.....");
			UserView();
		}
	}
	public void Buy() {
		Home myHomeobj7=new Home();
		System.out.println("Welcome to Buy....");
		System.out.println("Which Book you want Enter the Book Id: ");
		int buyBook;
		buyBook = scan.nextInt();
		if(BookCount[buyBook]==buyBook && BookCount[buyBook]!=0){
			System.out.println("Book Id       BookNames       BookPrice");
			System.out.println("   "+BookId[buyBook-1]+"            "+BookNames[buyBook-1]+"            "+BookPrice[buyBook-1]);
		}
		System.out.println("Enter the Book Count: ");
		int buyCount;
		buyCount=scan.nextInt();
		for(i=0;i<buyCount;i++) {
			BookCount[buyBook-1]=BookCount[buyBook-1]-buyCount;
			//System.out.println(BookCount);
			System.out.println("Book Id       BookNames");
			System.out.println("   "+BookId[buyBook-1]+"            "+BookNames[buyBook-1]);
		}
		System.out.println("SuccessFully You Bought Books.....");
		System.out.println("1>Sign Out");
		int userInputVAL;
		userInputVAL=scan.nextInt();
		switch(userInputVAL) {
		case 1:
			myHomeobj7.main(null);
		}
	}
}
