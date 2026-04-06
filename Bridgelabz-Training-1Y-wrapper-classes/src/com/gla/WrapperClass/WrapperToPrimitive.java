package scr.com.gla.Wrapper Class;

public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double d = 45.67;
        double x = d;
        int y = d.intValue();
        System.out.println(x);
        System.out.println(y);
    }
}
