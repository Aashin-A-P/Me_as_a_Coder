#include <stdio.h>
int main()
{
    int a;
    printf("Enter a number:");
    scanf("%d",&a);
    if(a%2==0)
        printf("Even no");
    else
        printf("Odd no");
    return 0;
}