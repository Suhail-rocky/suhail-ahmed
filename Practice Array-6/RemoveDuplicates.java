import java.util.*;
public class RemoveDuplicates{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String str=sc.nextLine();
	char[] arr = str.toCharArray();
	for(int i=0;i<arr.length;i++){
		boolean repeated = false;
	for(int j=i+1;j<arr.length;j++){
		if(arr[i] == arr[j]){
		repeated = true;
		break;
		}	
	}
	if(!repeated){
		System.out.print(arr[i]);
	}
}
//System.out.println(arr);
}
}
	