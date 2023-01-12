import java.util.Scanner;
public class RemoveCharinStr {
    public static void main(String[] rgs) {
        System.out.println("enter the string");
        Scanner s = new Scanner(System. in );
        String str = s.nextLine();
        RemoveCharinStr g = new RemoveCharinStr();
        g.replacechar(str);
    }
    public void replacechar(String str) {
        String e = "";
        int l = str.length();
        char ch[] = str.toCharArray();
        for (int i = 0; i < l; i++) {
            if (ch[i] == 'h' && ch[i + 1] == 'e') {
                ch[i] = ' ';
                ch[i + 1] = ' ';
                e += ch[i];
            } else {
                System.out.println("no ");
                break;
            }
        }
        System.out.println(e);
    }
}