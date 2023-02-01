public class SubStr {
    public static void main(String[] args)
    {
        String s="suhail";
        System.out.println(subString(s,0,4));
        System.out.println(subStrings(s,1));
    }
    public static String subStrings(String s,int i)
    {
        String temp="";
        for(int j=i;j<s.length();j++)
        {
            temp+=s.charAt(j);
        }
     return temp;
    }
    public static String subString(String s,int i,int j)
    {
        String temp = "";
        for(int a=i;a<j;a++)
        {
            temp += s.charAt(a);
        }
        return temp;
    }

}
