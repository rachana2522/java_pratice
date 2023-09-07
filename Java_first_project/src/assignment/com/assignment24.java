//Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.

package assignment.com;
class Bank {
    private String accountNumber;
    private double balance;

    public Bank(String string, double initialBalance) {
		// TODO Auto-generated constructor stub
	}

	public void BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Bank {
    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    void withdraw(double amount) {
        if (getBalance() - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance requirement not met.");
        }
    }
}
public class assignment24 {

    public static void main(String[] args) {
        Bank account = new Bank("12345", 500);
        SavingsAccount savingsAccount = new SavingsAccount("67890", 300);

        account.deposit(200);
        account.withdraw(150);
        System.out.println("Account Balance: " + account.getBalance());

        System.out.println();

        savingsAccount.deposit(50);
        savingsAccount.withdraw(100);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
    }
}


