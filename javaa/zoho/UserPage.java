public class UserPage extends AdminPage {
	UserPage us = new UserPage();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1.view || 2.buy ");
	int a = sc.nextInt();
	switch(a){
		case 1:
		us.view();
		break;
			case 2:
			System.out.println("Enter the Serial Number to delete : ");
		int buy = sc.nextInt();
		bookcount[buy]=0;
		for(int i=buy<bookcount.length-1;i++){
			int tempos= bookcount[i];
			bookcount[i]=bookcount[i+1];
			bookcount[i+1]=tempos;
		}
		System.out.println(bookcount);
	}
}
		
		
	
