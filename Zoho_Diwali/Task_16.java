import java.util.Scanner;

public class Task_16 {
	
public static void arrayStringsAreEqual(String[] word1, String[] word2) {
        String combinedString1 = "";
        String combinedString2 = "";
        
        for(int i=0; i<word1.length; i++)
            combinedString1+=word1[i];
        
        for(int i=0; i<word2.length; i++)
            combinedString2+=word2[i];
        
 
        System.out.println(combinedString1.equals(combinedString2));
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of Strings1 : ");
		int n = sc.nextInt();
		System.out.println("Enter a no of Strings2 : ");
		int m = sc.nextInt();
		System.out.println("Enter a String 1:");
		String[] word1= new String[n];
		for(int i=0;i<word1.length;i++)
			word1[i]=sc.next();
		System.out.println("Enter a String 2:");
		String[] word2= new String[m];
		for(int i=0;i<word2.length;i++)
			word2[i]=sc.next();
		arrayStringsAreEqual(word1,word2);
		
	}
}
