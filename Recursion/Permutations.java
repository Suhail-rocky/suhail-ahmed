
public class Permutations {
    public static void main(String[] args) {
        String s="ABC";
        printPermutation(s,0,"");
    }
    public static void printPermutation(String s,int index,String permutation)
    {
        if(s.length() == 0)
        {
            System.out.println(permutation);
            return;
        }
        for (int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            String temp =subString(s,0,i)+subStrings(s,i+1);
            printPermutation(temp,index+1,permutation+c);
        }
    }
    public static String subString(String s,int i,int j)
    {
        String temp = "";
        for(int a=i;a<j;a++)
        {
            temp+=s.charAt(i);
        }
        return temp;
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


}
