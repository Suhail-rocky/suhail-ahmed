import java.io.File;
class PrintFileFolder
{
	public static void main(String[] args)
	{
		File file=new File("C:\\Users\\Administrator\\Desktop");
		File[] filefolderList = file.listFiles();
		for(File f : filefolderList)
			if(f.isDirectory())
				System.out.println("Folder "+f);
			else if(f.isFile())
				System.out.println("File"+f);
			System.out.println("Folder and File Name : ");
			for(File f : filefolderList)
			if(f.isDirectory())
				System.out.println("Folder "+f.getName());
			else if(f.isFile())
				System.out.println("File"+f.getName());
	}
}