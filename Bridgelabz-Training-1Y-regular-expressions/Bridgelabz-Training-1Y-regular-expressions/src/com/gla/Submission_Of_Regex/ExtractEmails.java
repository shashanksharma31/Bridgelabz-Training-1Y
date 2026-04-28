package src.com.gla.Submission_Of_Regex;
import java.util.regex.*;
public class ExtractEmails {
    public static void main(String[] args) {
        String text="support@example.com info@test.com";
        Matcher m=Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+").matcher(text);
        while(m.find()) System.out.println(m.group());
    }
}