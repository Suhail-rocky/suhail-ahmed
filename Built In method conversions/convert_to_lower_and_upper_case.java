public class convert_to_lower_and_upper_case {
public static void main(String[] arg) {
//Original String: The Quick BroWn FoX!
//String in lowercase: the quick brown fox!
String str = "The Quick BroWn FoX!";
System.out.println("the original: "+str);
convert_to_lower_case(str);
convert_to_upper_case(str);
}

public static void convert_to_lower_case(String str) {
	char[] sa = new char[str.length()];
	for(int i=0;i<str.length();i++)
	{
		sa[i]=str.charAt(i);
	}
	for(int i=0;i&lt;str.length();i++)
	{
		if (sa[i]="">='A' && sa[i]<='Z'){
			
sa[i]= (char) (sa[i]+32); // this is casting variable
}
}
String str_new ="";
for (int i =0;i< sa.length;i++){
str_new+=sa[i];
}
System.out.println("string to lower case is : "+str_new);

}
public static void convert_to_upper_case(String str) {

char[] sa = new char[str.length()];
for (int i=0;i<str.length();i++){ sa[i]="str.charAt(i);" }="" for="" (int="" i="0;i&lt;str.length();i++){" if="" (sa[i]="">='a' && sa[i]<='z'){
sa[i]= (char) (sa[i]-32);
}
}
String str_new ="";
for (int i =0;i< sa.length;i++){
str_new+=sa[i];
}
System.out.println("string to lower case is : "+str_new);
}
}

 0
