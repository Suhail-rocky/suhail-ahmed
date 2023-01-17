import java.io.File;
class MultipleFolderCreation
{
	public static void main(String[] args)
	{
		File file = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\SuhailStudy\\java\\Files");
		boolean present = file.exists();
		if(present == false)
		{
			file.mkdirs();
		}
		System.out.println("Folder present "+present);
	}
}