class Ticket extends Thread {
    int tno;
    String type;

    Ticket(int tno, String type, int p) {
        this.tno = tno;
        this.type = type;
        this.setPriority(p);
    }

    public void run() {
        System.out.println("Processing " + tno + " (" + type + ")");
        try {
            Thread.sleep((int)(Math.random() * 4000) + 1000);
        } catch (Exception e) {}
        System.out.println("Ticket " + tno + " Done");
    }
}

public class Support {
    public static void main(String[] args) {
        new Ticket(101, "Bug", 10).start();
        new Ticket(102, "Query", 2).start();
        new Ticket(103, "Feature", 4).start();
    }
}
