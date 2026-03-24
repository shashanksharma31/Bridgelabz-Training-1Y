class BankAccount implements Runnable {
    String name;
    int priority;

    BankAccount(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " Priority: " + priority + " checking...");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Thread u1 = new Thread(new BankAccount("Rudra", 10));
        Thread u2 = new Thread(new BankAccount("Yash", 5));
        Thread u3 = new Thread(new BankAccount("Varun", 1));

        u1.setPriority(10);
        u2.setPriority(5);
        u3.setPriority(1);

        u1.start(); u2.start(); u3.start();
    }
}
