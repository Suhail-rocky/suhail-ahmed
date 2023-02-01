public class KeypadCombination {
    public static void main(String[] args) {
        String Keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String s="23";
        printKeypad(s, 0, "", Keypad);
    }

    private static void printKeypad(String s, int index, String Combination,String keypad[])
    {
        if(index == s.length())
        {
            System.out.println(Combination);
            return;
        }
        char c = s.charAt(index);
        String mapping = keypad[c-'0'];
        for(int i=0;i<mapping.length();i++)
        {
            printKeypad(s,index+1,Combination+mapping.charAt(i),keypad);
        }

    }
}
