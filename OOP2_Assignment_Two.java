/*
    2. You are designing an online payment system that supports multiple payment methods like Credit Card and PayPal.
       Each payment method has its own way of processing payments, but all must validate the amount (it should be positive).
        - Create an abstract class Payment with: An abstract method processPayment(double amount);
          A concrete method validateAmount(double amount) that throws an IllegalArgumentException if the amount is less than or equal to 0
        - Create subclasses: CreditCardPayment – implements processPayment() to print: "Processing credit card payment of $amount"
          PayPalPayment – implements processPayment() to print: "Processing PayPal payment of $amount"
        - Use a try-catch block to validate and process a payment. Catch and display an error message if the amount is invalid.
        - Example:
            Processing PayPal payment of $200.0 //valid
            Invalid payment amount: Amount must be greater than 0//invalid
*/
import java.util.Scanner;

abstract class Payment {
    public abstract void processPayment(double amount);

    public void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        validateAmount(amount);
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPalPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        validateAmount(amount);
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        CreditCardPayment payment = new CreditCardPayment();
        try {
            payment.processPayment(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Error processing payment: " + e.getMessage());
        }

        PayPalPayment paypalPayment = new PayPalPayment();
        try {
            paypalPayment.processPayment(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Error processing payment: " + e.getMessage());
        }
    }
}
