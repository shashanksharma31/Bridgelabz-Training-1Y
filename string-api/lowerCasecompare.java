import java.util.Scanner;

public class LowercaseCompare {

    static String convertLower(String text) {
        return text.toLowerCase();
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

        String lower1 = convertLower(text1);
        String lower2 = convertLower(text2);

        System.out.println("Lowercase Text1: " + lower1);
        System.out.println("Lowercase Text2: " + lower2);

        System.out.println("Are both same? " + compareStrings(lower1, lower2));
    }
}
