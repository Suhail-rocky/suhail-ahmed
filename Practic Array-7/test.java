import java.util.*;
public class test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++){
		String c = s.toCharArray();
		if(c == 'a' || c =='e' || c=='i' || c=='o' || c=='u'){
			continue;

			}
		}
	}
}