 /*String txt = "BACDGABCDA";
   String pat = "ABCD";*/
import java.util.*;

public class AnagramSubstring {

    static void search(char[] pat, char[] txt)
    {
        int n = txt.length, m = pat.length;
        char[] sortedpat = pat;
        //Arrays.sort(sortedpat);
		for(int i=0;i<sortedpat.length;i++)
		{
			for(int j=i+1;j<sortedpat.length;j++)
			{
				if(sortedpat[i] > sortedpat[j])
				{
					char temp = sortedpat[i];
					sortedpat[i]=sortedpat[j];
					sortedpat[j]=temp;
				}
			}
		}
		//System.out.println(new String(sortedpat));

        /*temp for storing the substring of length equal to
         * pat*/
        String temp;
        for (int i = 0; i <= n - m; i++) {
            temp = "";
            for (int k = i; k < m + i; k++)
                temp += txt[k];
            char tempArray[] = temp.toCharArray();
            //Arrays.sort(tempArray);
			for(int a=0;a<tempArray.length;a++)
			{
				for(int b=a+1;b<tempArray.length;b++)
				{
					if(tempArray[a] > tempArray[b])
					{
						char t = tempArray[a];
						tempArray[a]=tempArray[b];
						tempArray[b]=t;
					}
				}
			}
            temp = new String(tempArray);

            /*checking whether sorted versions are equal or
             * not*/
			 String ans = new String(sortedpat);
            if (ans.equals(temp))
                System.out.println("Found at Index " + i);
        }
    }

    public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String - 1");
        String txt = sc.next();
		System.out.println("Enter a String - 2");
        String pat = sc.next();
        search(pat.toCharArray(), txt.toCharArray());
    }
}

