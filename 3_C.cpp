/*
    3_C. Write a code in C++ to create a file that will hold the order details
    of a resaturant named "Yum Cha District". Write the Order no, list of items,
    unit price of each item, and the summative price in a file named, "Order_List.txt".
    Read the file and display the contents in the console.
*/

#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main() {
    ofstream file("Order_List.txt"); // Create a file named "Order_List.txt"
    file << "Order No: 1\n";
    file << "List of Items: Dudh, Kola, Bhat\n";
    file << "Unit Price: 100, 50, 20\n";
    file << "Summative Price: 170\n";
    file.close();

    ifstream readFile("Order_List.txt"); // Read the file
    string rakin;
    while (getline(readFile, rakin)) { // Read the file line by line
        cout << rakin << endl; // Display the contents in the console
    }
    readFile.close();

    return 0;
}
