import java.io.File;
import java.util.Scanner;
class DeleteOnlyExtension
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Extension to delete :");
		String extensions=sc.next();
		File file = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\SuhailStudy\\java\\Files");
		File[] filefolderArray=file.listFiles();
		for(File f : filefolderArray)
		{
			if(f.isFile())
			{
				String fileName =f.getName();
				int lastDot = fileName.lastIndexOf(".");
				String extension=fileName.substring(lastDot+1);
				if(extension.equals(extensions))
				{
					f.delete();
					System.out.println("deleted Sucessfully ");
				}
			}		
		}
		
	}
}