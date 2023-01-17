class SplitMethodSpecial
{
	public static void main(String[] args)
	{
		String sentence ="https:\\www.suhailstudy.com";
		String str[]=sentence.split("\\:|\\\\|\\.");
		for(String s : str) System.out.println(s);
	}
}