public class LastIndexOfDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.next();
		System.out.println("Enter a letter to find :");
		String find=sc.next(); 
		System.out.println(lastIndexOf(find));
		
	}
}