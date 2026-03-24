class Order implements Runnable {
    String id;
    int time;

    Order(String id, int time) {
        this.id = id;
        this.time = time;
    }

    public void run() {
        String agent = Thread.currentThread().getName();
        System.out.println(id + " Picked up by " + agent);
        try {
            System.out.println(id + " In Transit...");
            Thread.sleep(time * 1000);
        } catch (Exception e) {}
        System.out.println(id + " Delivered");
    }
}

public class Delivery {
    public static void main(String[] args) {
        Thread f1 = new Thread(new Order("ORD1", 2), "Agent1");
        Thread f2 = new Thread(new Order("ORD2", 5), "Agent2");

        f1.setPriority(10); f2.setPriority(5);
        f1.start(); f2.start();
    }
}
