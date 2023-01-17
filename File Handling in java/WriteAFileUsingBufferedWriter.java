import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.*;
class WriteAFileUsingBufferedWriter
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\SuhailStudy\\java\\Files\\File.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		int lineCount=0,sentenceCount=0,wordCount=0,charCount=0;
		while(line != null)
		{
			System.out.println(line);
			String sentence[]=line.split("[.]");
			String words[]=line.split(" ");
			sentenceCount = sentenceCount + sentence.length;
			wordCount = wordCount + words.length;
			charCount += line.length(); 
			line =br.readLine();
			lineCount++;
		}
		System.out.println("No of lines : "+lineCount);
		System.out.println("No of Sentences :"+sentenceCount);
		System.out.println("No of Words :"+wordCount);
		System.out.println("No of letters :"+charCount);
	}
}