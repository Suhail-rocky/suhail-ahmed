// Online C compiler to run C program online
#include <stdio.h>
int Decode(char* pStr)
{
    int iRetval = 0;
    if(pStr)
    {
        while(*pStr && pStr <= '9' && *pStr >= 0)
        {
            iRetval = (iRetval * 10)+(*pStr - '0');
            pStr++;
        }
    }
    return iRetval;
}
int main()
{
    printf("%d",Decode("7SENSE")+Decode("6"));
    return 0;
}