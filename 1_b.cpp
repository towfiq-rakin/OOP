#include <iostream>
#include <string>
using namespace std;

class ticket{
    private:
        int quantity;
        int seat[4];
        string coach;
        string time;
        string date;
        double price;
    public:
        ticket(){
            cout << "Enter the details of ticket: "<<endl;
            cout << "Enter the quantity: ";
            cin >> quantity;
            cout << "Enter the seat number: ";
            for(int i = 0; i < quantity; i++){
                cin >> seat[i];
            }
            cout << "Enter the coach (AC or General): ";
            cin >> coach;
            cout << "Enter the date: ";
            cin >> date;
            cout << "Enter the time: ";
            cin >> time;
        }
        void display(){
            cout << "Ticket details: "<<endl;
            cout << "Quantity: "<<quantity<<endl;
            cout << "Seat number: ";
            for(int i = 0; i < quantity; i++){
                cout << seat[i] << " ";
            }
            cout << endl;
            cout << "Coach: "<<coach<<endl;
            cout << "Date: "<<date<<endl;
            cout << "Time: "<<time<<endl;
        }
        double Price(){
            if(coach == "AC"){
                price = 1000 * quantity;
            }else{
                price = 500 * quantity;
            }
            return price;
        }
};
int main(){
    ticket t;
    t.display();
    cout << "Price: "<<t.Price()<<endl;
    return 0;
}
