import java.util.*;
public class TwistedPrime {
	public void twistedprime(int n){
	int reverse=0,sum=0,flag;
	for(int i=0;i<n;i++){
	while(n!=0)
		{
			reverse = n%10;
			sum = sum*10+reverse;
			n = n/10;
		}
		flag = 0;
		for(int j = 2;j<=sum/2;j++)
		{
			if((sum % j)== 0)
			{
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("Twisted prime number are : "+n+"  "+sum);
		else
			System.out.println("Not Twisted prime number ");
	}
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the prime number :");
		n = sc.nextInt();
		TwistedPrime tp = new TwistedPrime();
		tp.twistedprime(n);
		
	}

}
