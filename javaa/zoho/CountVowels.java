import java.util.*;
public class CountVowels{
	public void CountVowel(String s){
	char c[] = s.toCharArray();
	int count = 0;
	for(int i=0;i<s.length();i++){
	if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'|| s.charAt(i) == 'o'|| s.charAt(i) == 'u'|| s.charAt(i) == 'A' ||
	 s.charAt(i) == 'E'|| s.charAt(i) == 'O'|| s.charAt(i) == 'I'|| s.charAt(i) == 'I'){
	 count++;
	 }
	 }
	 System.out.println("The count of the vowels is "+count);
	 }
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String : ");
	String s = sc.nextLine();
	CountVowels c = new CountVowels();
	c.CountVowel(s);
	}
	}