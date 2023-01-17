import java.io.File;
import java.io.IOException;
class CreateFile
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\SuhailStudy\\java\\Files\\study.txt");
		boolean present = file.exists();
		if(present == false)
		{
			boolean created = file.createNewFile();
			System.out.println("File Created :"+created);
			
		}
		else
		{
			System.out.println("Already exits:"+present);
		}
	}
}