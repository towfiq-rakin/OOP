/*
    For Bangladesh Railway, build a program that will help the customer in online ticket reservation.
    You have to maintain data hiding to ensure security and exception handling.
    (Hint: The ticket may have seat number, coach number, quantity, price, time & date.
    Please take input from the user in runtime. Price will be calculated accordding to the quantity of seat. )
*/


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
        ticket(){ // Constractor
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
        void display(){ // Show the details of the ticket
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
        double Price(){ // Price Calculation
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
