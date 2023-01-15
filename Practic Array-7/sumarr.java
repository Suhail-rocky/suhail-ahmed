import java.util.Scanner;

public class sumarr {

	public static void main(String[] args) {
		System.out.println("Enter the number of array :");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] myarr = new int [size];
		int sum=0;
		System.out.println("Enter the number of elements : ");
		
		for(int i=0;i<size;i++)
		{
		myarr[i]=s.nextInt();
		sum=sum+myarr[i];
		}
		System.out.println("Sum of the array :"+sum);
	}

}
