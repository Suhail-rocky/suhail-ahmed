import java.util.*;
public class vowel{
	public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the String : ");
	String s = sc.nextLine();
	char a[]=s.toCharArray();
	for(int i=0;i<s.length();i++){
	if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'){
		continue;
		}
System.out.print(a[i]);
	}
}
}
	