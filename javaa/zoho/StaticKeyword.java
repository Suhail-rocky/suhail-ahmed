import java.util.*;
public class StaticKeyword{
	static int count = 0;
	int count1 = 0;
	public  StaticKeyword(){
	count += 1;
	count1 += 1;
	System.out.println(count);
	System.out.println(count1);
	}
	static{
		System.out.println("I'm static keyword");
	}
	
	public static void main(String[] args){
	System.out.println("This is main method ");
	StaticKeyword st = new StaticKeyword();
	StaticKeyword str= new StaticKeyword();
	StaticKeyword stw= new StaticKeyword();

	

	}
}