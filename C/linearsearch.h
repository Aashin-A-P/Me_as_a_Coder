#include <stdio.h>
int LinearSearch(int* arr,int size,int key){
    for(int i=0;i<size;i++)
        if(arr[i]==key)
            return i+1;
    return -1;
}