#include<iostream>
#include<iomanip>
using namespace std;
class shapes{
    public:
    float radius,length,breadth;
    int side;
    int area();
};

int area(int side)
    {
        return side*side;
    }

float area(float radius)
{
    return 3.14*radius*radius;
}

float area(float length,float breadth)
{
    return length*breadth;
}
int main()
{
    shapes s;
    char choose;
    cout<<"Enter the shape (C/S/R): ";
    cin>>choose;
    switch (choose)
    {
    case 'C':
        {
            cout<<"Enter the radius: ";
            cin>>s.radius;
            cout<<"Area of circle: "<<area(s.radius)<<endl;
            break;
        }
        
    case 'S':
        {
            cout<<"Enter the side: ";
            cin>>s.side;
            cout<<"Area of square: "<<area(s.side)<<endl;
            break;
        }
        
    case 'R':
        {
            cout<<"Enter the length and breadth: ";
            cin>>s.length>>s.breadth;
            cout<<"Area of rectangle: "<<area(s.length,s.breadth)<<endl;
            break;
        }
    
    default:
        break;
    }
    
}