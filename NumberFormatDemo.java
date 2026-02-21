import java.util.Scanner;

public class NumberFormatDemo {

    static void generate(String str) {
        int num = Integer.parseInt(str);
        System.out.println(num);
    }

    static void handle(String str) {
        try {
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Exception Caught");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        handle(text);
    }
}
