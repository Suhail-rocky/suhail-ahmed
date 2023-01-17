import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
class ReadAFileUsingBufferedReader
{
	public static void main(String[] args)throws IOException
	{
		File file = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\SuhailStudy\\java\\Files\\File.txt");
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Tamil");
		bw.newLine();
		bw.write("English");
		bw.newLine();
		bw.write("Maths");
		bw.flush();
		bw.close();
		System.out.println("Sucessfully Writen");
	}
}