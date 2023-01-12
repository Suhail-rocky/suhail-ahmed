import java.util.*; 
 public class Palindrome {

        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {

            System.out.println("Enter the string");
            String inputStr =sc.next();
            System.out.println("Given String = "+inputStr);
            char [] charArray=inputStr.toCharArray();
            int strlength=(charArray.length)-1;
            boolean isPalindrom=true;

            for(int count=0; count<charArray.length && strlength >= 0; count++,strlength--){
                if(charArray[count]!=charArray[strlength]){
                    isPalindrom=false;
                    break;
                }      
            }

            if(isPalindrom){
                System.out.println("palindrom");
            }else{
                System.out.println("not palindrom");
            }

        }
    }
