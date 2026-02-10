import java.util.Scanner;

public class StringIndexDemo {

    static void generate(String str) {
        System.out.println(str.charAt(str.length() + 1));
    }

    static void handle(String str) {
        try {
            System.out.println(str.charAt(str.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Caught");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        handle(text);
    }
}
