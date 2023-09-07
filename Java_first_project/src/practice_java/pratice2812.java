//Design a class representing a bank account. Implement a method to withdraw money.If the withdrawal amount exceeds the account balance, throw an 'InsufficientFundsException'. Demonstrate the usage of this class and handle the custom exception using try-catch.

package practice_java;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount34 {
    private double balance;

    public BankAccount34(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds to withdraw: " + amount);
        }
        
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}



public class pratice2812 {

    public static void main(String[] args) {
        BankAccount34 account = new BankAccount34(1000.0);

        try {
            account.withdraw(500.0);
            System.out.println("Withdrawal successful. Remaining balance: " + account.getBalance());

            account.withdraw(800.0); // This will throw InsufficientFundsException
            System.out.println("Withdrawal successful. Remaining balance: " + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}


