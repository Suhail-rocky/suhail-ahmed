import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class ReadAFile
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\SuhailStudy\\java\\Files\\File.txt");
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		writer.write("Allah is One");
		writer.write("\nMohammed is our prophet");
		writer.flush();
		writer.close();
		System.out.println("File written sucessully");
	}
}