/*
    1-C. Write a program using method overloading to find square of numbers. 
    (Hint: One method can work with integer number; 
    another method can work with double type number.)

*/
#include<iostream>
using namespace std;

class Square {
    public:
        int square(int x) {
            return x * x;
        }
        double square(double x) {
            return x * x;
        }
};

int main() {
    Square s;
    cout << "Square of 5: " << s.square(5) << endl;
    cout << "Square of 5.5: " << s.square(5.5) << endl;
    return 0;
}
