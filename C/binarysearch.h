#include <stdio.h>
int BinarySearch(int* arr,int size,int key){
    int left = 0;
    int right = size-1;
    while(left<=right){
        int mid = left + (right-left)/2;
        if(arr[mid] == key)
            return mid+1;
        else if(key<arr[mid])
            right = mid-1;
        else
            left = mid+1;
    }
    return -1;
}