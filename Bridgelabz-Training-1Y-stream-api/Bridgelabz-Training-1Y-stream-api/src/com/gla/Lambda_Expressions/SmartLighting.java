package src.com.gla.Lambda_Expressions;
interface Light {
    void turnOn();
}

public class SmartLighting {
    public static void main(String[] args) {
        Light motion = () -> System.out.println("Light ON by motion");
        Light time = () -> System.out.println("Light ON at night");
        Light voice = () -> System.out.println("Light ON by voice");

        motion.turnOn();
        time.turnOn();
        voice.turnOn();
    }
}
