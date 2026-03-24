import java.util.*;
class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println(n1 / n2);
        } catch (ArithmeticException e) {
            System.out.println("Zero divide error");
        } catch (InputMismatchException e) {
            System.out.println("Numbers only please");
        }
    }
}
