class reverse
{
    public:
    //Function to reverse words in a given string.
    string reverseWords(string s) 
    { 
        string str="";
        string result = "";
        string word;
 for(int i=0;s[i]!='\0';i++)
        {
          if(s[i]=='.')
            {
               word = s[i]+str;
               str="";
            }
           else
            {
               str+=s[i];
            }
       result = word+result;
       word="";
        }
       if(str!="")
      result = str+result;
      return result;
    } 
};