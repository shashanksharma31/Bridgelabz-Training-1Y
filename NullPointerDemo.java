public class NullPointerDemo {

    static void generateException() {

        String text = null;

        System.out.println(text.length());
    }

    static void handleException() {

        try {
            String text = null;
            System.out.println(text.length());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException Caught!");
        }
    }

    public static void main(String[] args) {

        System.out.println("Handling Exception:");
        handleException();
    }
}
