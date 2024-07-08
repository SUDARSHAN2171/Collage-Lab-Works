#include<iostream>
#include<iomanip>
using namespace std;
class Person
{
    protected :
    string Name;
    public :
    void setName()
    {   
        string a;
        cout<<"Enter the Name Of Person : "<<endl;
        cin>>a;
        Name=a;
    }
};

class Role 
{
    protected :
    string RoleId;
    public :

    void setRole()
    {
        string a;
        cout<<"Enter the Role Of Person : "<<endl;
        cin>>a;
        RoleId=a;
    }
};
class derived : public Person ,public Role{
    public : 
    void show() {
        cout<<"Name of Person : "<<Name<<endl;
        cout<<"Role of Preson : "<<RoleId<<endl;
        
    }
};
int main()
{
    derived obj ;
    obj.setName();
    obj.setRole();
    obj.show();
}