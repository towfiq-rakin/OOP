/*
    3-1. State the difference between the function overloading and overriding anlong with sample code.
    - Overloading is when you have multiple functions with the same name but different parameters. 
    - Overriding is when you have a function in a derived class 
      that has the same name and parameters as a function in the base class.
*/

#include <iostream>
using namespace std;

class Base {
public:
    void print() {
        cout << "Method of Base" << endl;
    }
};
class Derived : public Base {
public:
    // Function overriding
    void print() {
        cout << "Method of Derived" << endl;
    }
};

// Function overloading
void area(int a) {
    cout << "Area of square: " << a * a << endl;
}
void area(int a, int b) {
    cout << "Area of rectangle: " << a * b << endl;
}

int main() {
    Base b;
    Derived d;
    b.print(); // Funtion overriding
    d.print(); // Funtion overriding

    area(5); // Function overloading
    area(5, 6); // Function overloading
    return 0;
}
