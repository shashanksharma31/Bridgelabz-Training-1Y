import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    static void generateException() {
        int[] arr = {10, 20, 30};

        // Wrong index access
        System.out.println(arr[5]);
    }

    public static void main(String[] args) {

        try {
            generateException();
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e);
        }

        System.out.println("Program continues...");
    }
}
A