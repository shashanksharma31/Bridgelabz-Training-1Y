class LowBal extends Exception {}
class Bank {
    double bal = 5000;
    void withdraw(double amt) throws LowBal {
        if (amt < 0) throw new IllegalArgumentException();
        if (amt > bal) throw new LowBal();
        bal -= amt;
        System.out.println("Success. New bal: " + bal);
    }
    public static void main(String[] args) {
        Bank obj = new Bank();
        try {
            obj.withdraw(6000);
        } catch (LowBal e) {
            System.out.println("Insufficient balance!");
        } catch (Exception e) {
            System.out.println("Invalid amount!");
        }
    }
}
