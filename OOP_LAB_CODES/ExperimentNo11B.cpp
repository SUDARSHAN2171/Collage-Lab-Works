#include<iostream>
using namespace std;
int main()
{
    int number1,number2;
    cout<<"Enter the value for number1,number2"<<endl;
    cin>>number1>>number2;
    cout << "\nStart\n";
    try
    {
        if(number2 == 0)
        {
            throw number2;
            cout<<"This will not execute";
        }
        else
        {
            float result = (float)number1/number2;
            cout<<"Division of given numbers : "<<result<<endl; 
        }
    }

    catch(int i)
    {
        cout<<"Caught an exception trying to divide by zero : ";
        cout << i <<"\n";
    }
    cout<<"End"<<endl<<endl;
}