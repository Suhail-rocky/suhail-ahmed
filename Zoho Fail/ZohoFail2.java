import java.util.Scanner;
public class ZohoFail2{
	public static void main(String args[]){
		System.out.println("Enter the no.");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++){
			int m = n;
			for(int j=0;j<n;j++){
				if(i==0||j==0){
					System.out.print(n);
				}
				else if(j<=i){
					System.out.print(--m);
				}
				else
					System.out.print(m);
			}
			System.out.println();
		}
		}
	}