import java.util.Scanner;
public class StringConcat
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String-1");
		String s1=sc.next();
		String copy=s1.concat("Moammed");
		String s2=s1.concat("Ahmed");
		System.out.println(s1+" "+s2);
		String s3=s1+copy;
		System.out.println(s3);
		
	}
}