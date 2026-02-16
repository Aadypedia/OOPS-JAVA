import java.util.ArrayList;
import java.util.List;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        System.out.println(accountHolderName + " deposited $" + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for " + accountHolderName);
        }
        balance -= amount;
        System.out.println(accountHolderName + " withdrew $" + amount);
    }

    public void transfer(Account targetAccount, double amount) throws InsufficientFundsException {
        if (targetAccount == null) {
            System.out.println("Invalid target account.");
            return;
        }
        if (amount <= 0) {
            System.out.println("Invalid transfer amount.");
            return;
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds to transfer from " + accountHolderName);
        }
        balance -= amount;
        targetAccount.balance += amount;
        System.out.println(accountHolderName + " transferred $" + amount + " to " + targetAccount.accountHolderName);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.printf("Balance: $%.2f%n", balance);
        System.out.println();
    }
}

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void createAccount(String accountNumber, String accountHolderName, double initialBalance) {
        Account account = new Account(accountNumber, accountHolderName, initialBalance);
        accounts.add(account);
        System.out.println("Account created for " + accountHolderName);
    }

    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts in the bank.");
        } else {
            System.out.println("Bank Accounts:");
            for (Account account : accounts) {
                account.displayAccountDetails();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.createAccount("A001", "Alice", 500);
        bank.createAccount("A002", "Bob", 300);

        Account alice = bank.getAccount("A001");
        Account bob = bank.getAccount("A002");

        bank.displayAllAccounts();

        alice.deposit(200);
        bob.deposit(100);

        try {
            alice.withdraw(100);
            bob.withdraw(500); // triggers exception
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            alice.transfer(bob, 200);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        bank.displayAllAccounts();
    }
}