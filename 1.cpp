#include <cmath>
#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a number:";
    cin >> n;
    cout << "The no of digits:" << int(log10(n)+1)<<endl;
    int a=n,sum=0;
    while(a>0){
        int d=a%10;
        sum=sum*10+d;
        a=a/10;
    }
    cout<< "The reversed no is:"<< sum <<endl;
    return 0;
}