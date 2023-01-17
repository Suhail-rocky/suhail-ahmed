import java.io.File;
import java.io.IOException;
import java.io.FileReader;
class WriteAFile
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\SuhailStudy\\java\\Files\\File.txt");
		FileReader reader = new FileReader(file);
		char ch[]=new char[(int)file.length()];
		//System.out.println(ch.length);
		reader.read(ch);
		for(char ch1 : ch)
		{
			System.out.print(ch1);
		}
		
		
	}
}