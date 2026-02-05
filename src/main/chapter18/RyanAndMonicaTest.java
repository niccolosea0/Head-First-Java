import java.util.concurrent.*;

public class RyanAndMonicaTest {
    public static void main(String[] args) {
         
         BankAccount account = new BankAccount();
         RyanAndMonicaJob ryan = new RyanAndMonicaJob("Ryan", account, 50);
         RyanAndMonicaJob monica = new RyanAndMonicaJob("Monica", account, 100);
         ExecutorService executor = Executors.newFixedThreadPool(2);
         executor.execute(ryan);
         executor.execute(monica);
         executor.shutdown();
    }
}

class RyanAndMonicaJob implements Runnable {

    private final String name;
    private final BankAccount account;
    private final int amountToSpend;

    RyanAndMonicaJob(String name, BankAccount account, int amountToSpend) {
        this.name = name;
        this.account = account;
        this.amountToSpend = amountToSpend;
    }

    public void run() {
        goShopping(amountToSpend);
    }

    private void goShopping(int amount) {
       System.out.println(name + " is about to spend");
       account.spend(amount);
       System.out.println(name + " finishes spending");
    }
}

class BankAccount {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public synchronized void spend(int amount) {
        if (balance >= amount) {
            balance -= amount;
        }
        else {
            System.out.println("Sorry, not enough money for");
        }
    }
}
