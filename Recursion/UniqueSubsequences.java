import java.util.HashSet;
public class UniqueSubsequences {
    public static void main(String[] args) {
        String s="aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequences(s,0,"",set);
    }
    private static void uniqueSubsequences(String s,int i,String temp,HashSet<String> set)
    {
        if(i == s.length()) {
            if(set.contains(temp)) {
                return;
            }
            else {
                System.out.println(temp);
                set.add(temp);
                return;
        }
        }
        char c = s.charAt(i);
        //take
        uniqueSubsequences(s,i+1,temp+c,set);
        //not take
        uniqueSubsequences(s,i+1,temp,set);
    }

}
