import java.io.File;
import java.util.Scanner;
class PrintOnlyWantedExtension
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\Users\\Administrator\\Desktop\\java\\02-01-2023");
		System.out.println("Enter the extension files you want ");
		String s=sc.next();
		File[] filefolderArray=file.listFiles();
		for(File f : filefolderArray)
		{
			if(f.isFile())
			{
				String fileName =f.getName();
				int lastDot = fileName.lastIndexOf(".");
				String extension=fileName.substring(lastDot+1);
				if(extension.equals(s))
				{
					System.out.println(fileName);
				}
			}
			if(f.length()>200)
			System.out.println(f.length());
		}
		
	}
}