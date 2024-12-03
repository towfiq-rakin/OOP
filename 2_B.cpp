// 2-B. Write a C++ code that resembles Multilevel Inheritance.

#include <iostream>
using namespace std;

class A{
    int i, j;
    public:
    A() { i = 1; j = 2; } // Constractor
    void showA(){ cout << i << " " << j << endl; }
};

class B: public A{
    int k, l;
    public:
    B() { k = 3; l = 4; } // Constractor
    void showB(){ cout << k << " " << l << endl; }
};

class C: public B{
    int m, n;
    public:
    C() { m = 5; n = 6; } // Constractor
    void showC(){ cout << m << " " << n << endl; }
};

int main(){
    C c;
    c.showA(); // C inherits A and B, so it can access showA()
    c.showB(); // C inherits B, so it can access showB()
    c.showC();
    return 0;
}
