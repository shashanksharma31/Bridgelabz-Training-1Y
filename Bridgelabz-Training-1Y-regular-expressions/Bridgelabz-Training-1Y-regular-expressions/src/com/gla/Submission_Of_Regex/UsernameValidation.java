package src.com.gla.Submission_Of_Regex;
public class UsernameValidation {
    public static void main(String[] args) {
        String username = "user_123";
        System.out.println(username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$"));
    }
}