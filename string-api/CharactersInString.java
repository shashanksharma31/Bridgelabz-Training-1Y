import java.util.Scanner;

public class CharactersInString {

    static void printCharacters(String str) {

        System.out.println("Characters in the string:");

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        printCharacters(text);

        char[] arr = text.toCharArray();
        System.out.println("Using toCharArray():");

        for (char ch : arr) {
            System.out.println(ch);
        }
    }
}
