import java.util.Scanner;
import java.io.File;
import java.io.IOException;
class CreateeFolder
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\createFolder");
		boolean res=file.mkdir();//make directory-create folder
		System.out.println(res);
		System.out.println(file.exists());
		File files = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\createFolder\\study.txt");
		if(!files.exists())
		{
			files.createNewFile();
			
		}
		else
		{
			System.out.println("Already have");
			System.out.println(files.canRead());
			System.out.println(files.canWrite());
		}
		File fil = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\createFolder\\suhail\\suhail2\\suhail3\\Ahmed.txt");
		boolean result=fil.mkdirs();//make directory-create  many folder
		fil.createNewFile();
		System.out.println(result);
		
	}
}