class account implements Runnable {
    private String name;
    private int balance;
    private String requestType;
    private int amount;

    account(String name,int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void setRequest(String requestType, int amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public void getBalance() {
        System.out.println(name + " checked balance: " + balance + " BDT");
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println(name + " deposited " + amount + " BDT. New balance: " + balance + " BDT");
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(name + " withdrew " + amount + " BDT. New balance: " + balance + " BDT");
        } else {
            System.out.println(name + " failed to withdraw " + amount + " BDT. Insufficient balance.");
        }
    }

    @Override
    public void run() {
        switch (requestType) {
            case "balance":
                getBalance();
                break;
            case "deposit":
                deposit(amount);
                break;
            case "withdraw":
                withdraw(amount);
                break;
            default:
                System.out.println("Invalid request type.");
        }
    }
}

public class InternetBanking {
    public static void main(String[] args) {
        // Creating 3 accounts
        account one = new account("CR Muhit",10000);
        account two = new account("CR Marjia",0);
        account three = new account("CR Shahed", 5000);
        // Setting requests
        one.setRequest("balance",0);
        two.setRequest("deposit",15000);
        three.setRequest("withdraw",2500);
        // Creating threads
        Thread user1 = new Thread(one);
        Thread user2 = new Thread(two);
        Thread user3 = new Thread(three);
        // Starting threads
        user1.start();
        user2.start();
        user3.start();
    }
}