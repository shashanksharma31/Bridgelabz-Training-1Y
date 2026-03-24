class Exam extends Thread {
    String act;
    int wait;

    Exam(String act, int wait) {
        this.act = act;
        this.wait = wait;
    }

    public void run() {
        try {
            Thread.sleep(wait * 1000);
            System.out.println(act + " State: " + this.getState());
        } catch (Exception e) {}
    }
}

public class University {
    public static void main(String[] args) {
        Exam e1 = new Exam("Entry", 0);
        Exam e2 = new Exam("Papers", 5);
        Exam e3 = new Exam("Attendance", 10);

        e2.setPriority(10);
        e1.start(); e2.start(); e3.start();
    }
}
