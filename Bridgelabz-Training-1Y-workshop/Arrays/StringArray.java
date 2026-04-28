public class StringArray {
    public static void main(String[] args) {
        String[] names = {"Aman", "Sameer", "Mraduvendra", "Samrat"};
        System.out.println("First name: " + names[0]);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for (String name : names) {
            System.out.println("Hello, " + name);
        }
    }
}