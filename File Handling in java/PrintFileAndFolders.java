import java.util.Scanner;
import java.io.File;
import java.io.IOException;
class PrintFileAndFolders
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\createFolder\\suhail.txt");
		if(!file.exists())// check if the file is exists or not
		{
			file.createNewFile();//create new file
		}
		else
		{
			File files = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\createFolder\\Ahmed.txt");
			files.createNewFile();
		}
		
		System.out.println("If you want to delete press 1");
		int press = sc.nextInt();
		if(press == 1)
		{
			File filed = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\createFolder\\Ahmed.txt");
			filed.delete();//delete file
		}
		File fil = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\createFolder");
		String prints[]=fil.list();//print file
		for(int i=0;i<prints.length;i++)
		{
			System.out.println(prints[i]);
		}
		File ff = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\createFolder");
		File f[]=ff.listFiles();
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
		// print only folders
		for(int i=0;i<f.length;i++)
		{
			if(f[i].isDirectory())
			System.out.println(f[i]);
		}
		//print only file
		 for(int i=0;i<f.length;i++)
		{
			if(f[i].isFile())
			System.out.println(f[i]);
		}
		for(int i=0;i<prints.length;i++)
		{
			if(prints[i].charAt(0) == 's')
			System.out.println(prints[i]);
		}
		//print file or folder name
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i].getName());
		}
		//print Hidden file or folder name
		for(int i=0;i<f.length;i++)
		{
			if(f[i].isHidden())
			System.out.println(f[i].getName());
		}
		
		
		
	}
}