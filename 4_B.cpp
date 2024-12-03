/*
    4-B. Write a C++ program to display the following ouput using function overloading:
    Output:
    Printing int: 4
    Printing float: 400.73
    Printing string: C++ is bullshit
*/
#include <iostream>
using namespace std;
void print(int n) {
    cout << "Printing int: " << n << endl;
}
void print(double f) {
    cout << "Printing float: " << f << endl;
}
void print(string s) {
    cout << "Printing string: " << s << endl;
}

int main() {
    print(4);
    print(400.73);
    print("C++ is bullshit");
    return 0;
}
