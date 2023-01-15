// Online C compiler to run C program online
#include <stdio.h>
void f(int *a,int m)
{
    int j=0;
    for(int j=0;j<m;j++)
    {
        *(a+j)=*(a+j)-5;
    }
}
int main()
{
    int a[] ={'s','v','c','e'};
    int j=0;
    f(a,4);
    printf("%d\t",a[1]-'a');
    return 0;
}