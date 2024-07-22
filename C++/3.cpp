#include<iostream>
using namespace std;
int main(){
    int f=10;
    int* ptr;
    int &value=f;
    ptr=&f;
    cout<<value<<" "<<*ptr<<" "<<f<<endl;
    ++*ptr;
    cout<<value<<" "<<*ptr<<" "<<f<<endl;
    return 0;
}