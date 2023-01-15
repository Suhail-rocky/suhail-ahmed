import java.util.*;
public class PrintNoofWords{
	public void printnoofword(String s){
		int count = 0;
		String w ="";
		s+=" ";
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);	
			if(c != ' ')
				w+=c;
			else{
				count++;
				w ="";
				}
			}
			System.out.println("The Count of the words are "+count);
		}
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		PrintNoofWords p = new PrintNoofWords();
		p.printnoofword(s);
		
		
	}
	}