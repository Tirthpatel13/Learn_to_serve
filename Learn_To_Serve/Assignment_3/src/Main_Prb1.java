public class Main_Prb1 {
    public static void main(String[] args) {
        // Create a shared BankAccount with an initial balance of $1000
        BankAccount account = new BankAccount(1000);

        // Create 4 threads representing bank customers performing transactions
        Thread t1 = new Thread(new BankCustomer(account, true, 500), "Customer-1"); // deposit $500
        Thread t2 = new Thread(new BankCustomer(account, false, 700), "Customer-2"); // withdraw $700
        Thread t3 = new Thread(new BankCustomer(account, true, 200), "Customer-3"); // deposit $200
        Thread t4 = new Thread(new BankCustomer(account, false, 300), "Customer-4"); // withdraw $300

        // Start all threads (transactions start happening in parallel)
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Ensure all threads finish execution before calculating final balance
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Print final balance after all transactions are complete
        System.out.println("Final account balance: $" + account.getBalance());
    }
}
