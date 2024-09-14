#include<isotream>
using namespace std;
void Xtest(int test)
{
    cout<<"Inside Xtest, test is : "<< test << "\n";
    if(test)
        throw test;
}

int main()
{
    cout << "Start\n";
    try
    {
        cout << "Inside try block\n";
        xtest(0);
        xtest(1);
        xtest(2);
    } 
    
    catch(int i)
    {
        cout << "Caught an  exception -- value is : ";
        cout << i <<"\n";
    }

    cout << "End\n";
    return 0;
}