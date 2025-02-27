class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized  (prevents race conditions)
    public synchronized void deposit(double amount) {
        balance += amount; // Add money to balance
        System.out.println(Thread.currentThread().getName() + " deposited $" + amount + ". New balance: $" + balance);
    }

    // Synchronized so ensures correct balance update
    public synchronized void withdraw(double amount) {
        if (balance >= amount) { // Check if enough money is available
            balance -= amount; // Deduct money from balance
            System.out.println(Thread.currentThread().getName() + " withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw $" + amount + " but insufficient funds. Balance: $" + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

class BankCustomer implements Runnable {
    private BankAccount account; // Shared bank account
    private boolean deposit; // True for deposit, false for withdrawal
    private double amount; // Transaction amount

    // Constructor to initialize customer action
    public BankCustomer(BankAccount account, boolean deposit, double amount) {
        this.account = account;
        this.deposit = deposit;
        this.amount = amount;
    }

    // task to be run by the thread
    @Override
    public void run() {
        if (deposit) {
            account.deposit(amount); // Perform deposit
        } else {
            account.withdraw(amount); // Perform withdrawal
        }
    }
}