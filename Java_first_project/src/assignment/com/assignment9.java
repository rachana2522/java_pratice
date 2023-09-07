//Write a Java program to create a class known as "BankAccount" with methods called deposite() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.


package assignment.com;

class BankAccount{
	private String accountNumber;
	private double balance;
	
public BankAccount(String accountNumber, double initialbalance) {
   this.accountNumber = accountNumber;
   this.balance = initialbalance;
}
public void deposit(double amount) {
	balance+=amount;
	System.out.println("Deposited:$"+amount);
}

public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance to withdraw $" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw due to minimum balance requirement.");
        }
    }
}
public class assignment9 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", 1000);
        account1.deposit(500);
        account1.withdraw(200);

        SavingsAccount savingsAccount = new SavingsAccount("789012", 500);
        savingsAccount.deposit(300);
        savingsAccount.withdraw(150);
        savingsAccount.withdraw(400); // This will be prevented

        System.out.println("Account 1 Balance: $" + account1.getBalance());
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
    }
}


