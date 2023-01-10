import java.util.*;
public class T6
{
	public static void main(String[] args)
	{
		int vowel=0,consonant=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i] == 'a'|| c[i] == 'e'|| c[i] == 'i'|| c[i] == 'o'|| c[i] == 'u'||c[i] == 'A'||c[i] == 'E'|| c[i] == 'I'|| c[i] == 'O'|| c[i]=='U')
			{
				vowel++;
			}
			else
			{
				consonant++;
			}
		}
		System.out.println("The Vowel is "+vowel);
		System.out.println("The Consonant is "+consonant);
		
	}
}