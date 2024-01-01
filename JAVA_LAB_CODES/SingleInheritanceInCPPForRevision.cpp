#include<iostream>
#include<iomanip>
using namespace std;
class student
{
    int rollno;
    char div;
    public :

    void setdate();
    int getinfo1();
    char getinfo2();
};

void student ::  setdate(void)
{
    int a;
    char b;
    cout<<"Enter Roll Number : ";
    cin>>a;
    cout<<"Enter Division : ";
    cin>>b;
    rollno = a;
    div = b;
}
 int student :: getinfo1()
{
     return rollno;
}

char student :: getinfo2()
{
     return div;   
}
class marks : public student
{   
    public :
    int m1,m2,m3;
    int inputMarks();
    void display();
};

int marks :: inputMarks()
{
    cout<<"Enter Marks in Subject 1 : ";
    cin>>m1;
    cout<<"Enter Marks in Subject 2 : ";
    cin>>m2;
    cout<<"Enter Marks in Subject 3 : ";
    cin>>m3;
}

void marks :: display()
{
    cout<<endl<<"Roll No : "<<getinfo1()<<endl<<"Division : "<<getinfo2()<<endl;
    cout<<"Subject 1 : "<<m1<<endl;
    cout<<"Subject 2 : " <<m2<<endl;
    cout<<"Subject 3 : "<<m3<<endl;  

}

int main()
{
    marks d;
    d.setdate();
    d.inputMarks();
    d.display();
}