import java.util.*;
public class Coins{
	public static void main(String[] args){
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of array :");
		int n = sc.nextInt();
		int coins[] = new int[n];
		System.out.println("Enter a array : ");
		for(int i=0;i<n;i++)
			coins[i]=sc.nextInt();
		System.out.println("Enter a Sum value : ");
		int sum = sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(coins[i]+coins[j] == sum){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}