import java.util.*;
public class Strr {
    public static String toUpperCas(String s){
        char ch;
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch > 96 && ch < 123)
                newStr += (char) (s.codePointAt(i) - 32);
            else
                newStr += ch;
        }
        return newStr;
    }

}

class Main {
	
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
        String str = sc.next();
        System.out.println("Original String: " + str);
        System.out.println("String in uppercase: " + Strr.toUpperCas(str));
    }
}