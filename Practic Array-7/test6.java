import java.util.*;
public class test6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		String temp="";
		for(int i=0;i<s.length();i++){
		char c[]= s.charAt(i);
		if(s.charAt(i) == 'a' || c =='e' || c=='i' || c=='o' || c=='u'){
			continue;
			c+=temp;
			System.out.println(c);
			}
		}

	}
}
			