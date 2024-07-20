#include <stdio.h>
#include "linearsearch.h"
#include "binarysearch.h"
int main(){
    printf("Enter the no of elements:");
    int n,key;
    scanf("%d",&n);
    int arr[n];
    printf("Enter the elements:");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("Choose which option u want for search:");
    printf("\n1.Linear Search");
    printf("\n2.Binary Search");
    int opt;
    scanf("%d",&opt);
    printf("Enter the key:");
    scanf("%d",&key);
    int pos;
    switch (opt)
    {
    case 1:
        pos = LinearSearch(arr,n,key);
        break;
    case 2:
        pos = BinarySearch(arr,n,key);
        break;
    default:
        break;
    }
    if(pos==-1){
        printf("Element not found");
    }
    else{
        printf("Element found in position : %d",pos);
    }
    return 0;
}