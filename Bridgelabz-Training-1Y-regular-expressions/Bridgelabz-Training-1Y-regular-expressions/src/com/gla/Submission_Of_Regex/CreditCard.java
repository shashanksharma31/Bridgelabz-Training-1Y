package src.com.gla.Submission_Of_Regex;
public class CreditCard {
    public static void main(String[] args) {
        String card="4123456789012345";
        System.out.println(card.matches("^[45]\d{15}$"));
    }
}