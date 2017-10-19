#include<iostream>
using namespace std;

int main(){
int number1=1,number2=2,sum=0,evensum=2;
while(number1+number2<4000000){
    sum=number1+number2;
    number1=number2;
    number2=sum;
    if(sum%2==0){
        evensum=evensum+sum;
    }

}
   cout<<"The total value of summation of even term is"<<" "<<evensum<<endl;
return 0;
}

