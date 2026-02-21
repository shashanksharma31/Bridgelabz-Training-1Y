import java.util.Scanner;

public class UppercaseCompare {

    static String convertUpper(String text) {
        return text.toUpperCase();
    }

    static boolean compareStrings(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first text:");
        String text1 = sc.nextLine();

        System.out.println("Enter second text:");
        String text2 = sc.nextLine();

        String upper1 = convertUpper(text1);
        String upper2 = convertUpper(text2);

        System.out.println("Uppercase Text1: " + upper1);
        System.out.println("Uppercase Text2: " + upper2);

        System.out.println("Are both same? " + compareStrings(upper1, upper2));
    }
}
