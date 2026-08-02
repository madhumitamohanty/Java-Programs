class BankAccount {
    int balance = 1000;

    synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount);

        if (balance >= amount) {
            System.out.println("Processing withdrawal for " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); 
            } catch (Exception e) {
                System.out.println(e);
            }

            balance = balance - amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal");
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
        }
    }
}

class Customer extends Thread {
    BankAccount account;
    int amount;

    Customer(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}

public class BankSynchronization {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        Customer t1 = new Customer(acc, 700);
        Customer t2 = new Customer(acc, 500);

        t1.setName("Customer-1");
        t2.setName("Customer-2");

        t1.start();
        t2.start();
    }
}