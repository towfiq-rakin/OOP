/*
    3-B. Is this a runnable code? If not, fix the errors.

    #include <iostream>
    using namespace std

    class Rectangle{
        private:
        int length,
        int breadth;
        public:
        Rectangle(int len, int brth) lentgh(len), breadth(brth) {}
        int getArea( {
            return length * breadth,
        }
    };

    int main() {
        Rectangle rect(8.9, 6.7);
        cout << "Area = " <<rect->getArea() << endl;
        return 0;
    }
*/

// Fixed code:
#include <iostream>
using namespace std;

class Rectangle {
    private:
    double length;
    double breadth;
    public:
    Rectangle(double len, double brth) : length(len), breadth(brth) {}
    double getArea() {
        return length * breadth;
    }
};

int main() {
    Rectangle rect(8.9, 6.7);
    cout << "Area = " << rect.getArea() << endl;
    return 0;
}
