#include <iostream>
using namespace std;
class Ball{
    float r,area,pi=3.14;
    public:
        void setradius(float radius){
            r=radius;
        }
        float setarea(){
            area=pi*r*r;
            return area;
        }
};
int main(){
    Ball a;
    a.setradius(12.5);
    cout<<a.setarea()<<endl;
    return 0;
}