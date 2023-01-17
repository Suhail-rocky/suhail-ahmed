import java.util.Scanner;
import java.io.File;
class FolderCreationDemo
{
	public static void main(String[] args)
	{
		File file = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\SuhailStudy");
		boolean present = file.exists();
		if(present == false)
		{
			file.mkdir();
			System.out.println("Folder is created ");
		}
		System.out.println("Folder present :"+present);
	}
}