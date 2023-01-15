import java.util.*;
class brackets{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int count =0;
int count1=0;
int count2=0;
System.out.println("Enter the brackets : ");
String s = sc.nextLine();
char a[]= s.toCharArray();
for(int i=0;i<a.length;i++)
{
	if(a[i] != ' ')
	{
		for(int j=i+1;j<a.length;j++){
				{
					if(a[i] == 40 && a[j] == 41 )
					{
						//System.out.println(true);
						count++;
						a[j] =' ';
					}
				    if(a[i] == 123 && a[j] == 125){
						//System.out.println(true);
						count1++;
						a[j] =' ';
						}
					if(a[i] == 91 && a[j] == 93)
					{
						//System.out.println(true);
						count2++;
						a[j] =' ';
					}
				}
		}
	}
}
System.out.println("() is "+count);
System.out.println("{} is "+count1);
System.out.println("[] is "+count2);
}
}