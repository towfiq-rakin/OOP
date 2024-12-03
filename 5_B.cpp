/*
    5-B. Constrct the following output using virtual function.
    Output:
    Vehicle Cholena
    Bus o Cholena
    Car o Cholena
    Bike o Cholena
*/
#include <iostream>
#include <string>
using namespace std;
class Vehicle {
    public:
        virtual void display() {
            cout << "Vehicle Cholena" << endl;
        }
};
class Bus : public Vehicle {
    public:
        void display() {
            cout << "Bus o Cholena" << endl;
        }
};
class Car : public Vehicle {
    public:
        void display() {
            cout << "Car o Cholena" << endl;
        }
};
class Bike : public Vehicle {
    public:
        void display() {
            cout << "Bike o Cholena" << endl;
        }
};
int main() {
    Vehicle *v;
    Vehicle v1;
    Bus b;
    Car c;
    Bike bk;
    v = &v1;
    v->display(); // Vehicle Cholena
    v = &b;
    v->display(); // Bus o Cholena
    v = &c;
    v->display(); // Car o Cholena
    v = &bk;
    v->display(); // Bike o Cholena
    return 0;
}
