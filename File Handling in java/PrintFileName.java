import java.io.File;
class PrintFileName
{
	public static void main(String[] args)
	{
		File file = new File("C:\\Users\\Administrator\\Desktop\\Java Interview Preparation\\File Handling in java\\SuhailStudy\\java\\Files\\suhail.txt");
		System.out.println(file.getName());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());
		File fil = new File("C:\\Users\\Administrator\\Desktop");
		String printAll[]=fil.list();
		for(int i=0;i<printAll.length;i++)
		{
			System.out.println(printAll[i]);
		}
		System.out.println("For Each ");
		for(String s : printAll)
			System.out.println(s);
	}
}	
