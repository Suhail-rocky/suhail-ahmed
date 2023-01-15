import java.util.*;
public class MiddleCharacterString{
	public static void MiddleCharacterStr(String s){
		char c[] = s.toCharArray();
		System.out.println(s.length());
			if(s.length() % 2 == 0){
				int middle = s.length()/2 - 1;
				System.out.println("The middle of the Character is "+s.charAt(middle));
			}
			else if(s.length() %2 != 0){
				int middle = s.length()/2 ;
				System.out.println("The middle of the Character is "+s.charAt(middle));
				
					}
	}
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		MiddleCharacterStr(str);
		}
		}