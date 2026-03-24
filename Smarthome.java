class Device implements Runnable {
    String dname;
    int sec;

    Device(String dname,int sec) {
        this.dname = dname;
        this.sec = sec;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(dname + " active at " + System.currentTimeMillis());
            try {
                Thread.sleep(sec * 1000);
            } catch (Exception e) {}
        }
    }
}

public class Smarthome {
    public static void main(String[] args) {
        Thread cam = new Thread(new Device("Camera", 3));
        Thread temp = new Thread(new Device("Temp", 5));
        Thread light = new Thread(new Device("Light", 4));
        Thread door = new Thread(new Device("Door", 6));

        cam.setPriority(10);
        temp.setPriority(7);
        cam.start();
        temp.start();
        light.start();
        door.start();
    }
}
