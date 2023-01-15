import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int rows =s.nextInt();
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("%d");
			}
			System.out.println();
		}
		

	}

}
