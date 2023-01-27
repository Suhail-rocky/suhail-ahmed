public class Subsequences {
    public static void main(String[] args) {
        String s ="abc";
        subsequences(s,0,"");
    }
    private static void subsequences(String s,int i,String temp)
    {
        if(i == s.length())
        {
            System.out.println(temp);
            return;
        }
        char c =s.charAt(i);
        //take
        subsequences(s,i+1,temp+c);
        //not take
        subsequences(s,i+1,temp+"-");
    }

}
