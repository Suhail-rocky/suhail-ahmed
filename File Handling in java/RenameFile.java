import java.io.File;
import java.io.IOException;
class RenameFile
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\SuhailStudy\\java\\Files\\study.txt");
		boolean present = file.exists();
		if(present == false)
		{
			boolean created = file.createNewFile();
			System.out.println("File created :"+created);
		}
		else
		{
			System.out.println("file is already exists");
		}
		File reName=new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\SuhailStudy\\java\\Files\\suhail.txt");
		boolean renameSucess = file.renameTo(reName);
		System.out.println("rename sucesfully "+renameSucess);
	}
}