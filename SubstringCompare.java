import java.util.Scanner;

public class SubstringCompare {

    static String createSubstringUsingCharAt(String str, int start, int end) {

        String sub = "";

        for (int i = start; i < end; i++) {
            sub += str.charAt(i);
        }

        return sub;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String sub1 = createSubstringUsingCharAt(text, start, end);

        String sub2 = text.substring(start, end);

        System.out.println("Substring using charAt(): " + sub1);
        System.out.println("Substring using substring(): " + sub2);

        System.out.println("Are both same? " + sub1.equals(sub2));
    }

