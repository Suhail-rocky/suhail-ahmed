import java.util.Scanner;
class OddNumberRange
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a start number : ");
		int start = sc.nextInt();
		System.out.println("Enter a End Number : ");
		int end = sc.nextInt();
		for(int i=start;i<end;i++)
		{
			if(i%2 != 0)
			{
				System.out.print(i+",");
			}
		}
		
	}
}