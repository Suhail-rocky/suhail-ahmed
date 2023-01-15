import java.util.*;
public class TwinPrimeNo{
	public static CheckTwinPrimeNo(int n){
		int i;
		int m = 0;
		int flag = 0;
		m = n/2;
		if (n == 0 || n == 1)
			return false;
		else {
			for(i=2;i<=m;i++){
				if(n % i == 0){
					flag = 1;
					return false;
				}
			}
			if(flag == 0)
			{
				return true;
			}
		}
		return false;
		}
	public static 		
			
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Start value : ");
	int a = sc.nextInt();
	System.out.println("Enter the End value : ");
	int b = sc.nextInt();
	for(int i=a;i<b;i++){
		if(CheckTwinPrimeNo(i)){
			System.out.println(i);
		}
	}
}
}
	