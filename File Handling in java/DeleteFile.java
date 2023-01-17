import java.io.File;
import java.io.IOException;
class DeleteFile
{
	public static void main(String[] args)
	{
		File file = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\SuhailStudy\\java\\Files\\study.txt");
		boolean present = file.exists();
		if(present == true)
		{
			boolean deleted =file.delete();
			System.out.println("file is deleted "+deleted);
		}
		else
		{
			System.out.println("File not found ");
		}
	}
}