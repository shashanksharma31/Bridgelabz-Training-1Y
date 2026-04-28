package src.com.gla.Submission_Of_Regex;
import java.util.regex.*;
public class CapitalWords {
    public static void main(String[] args) {
        String text="Hello World Java";
        Matcher m=Pattern.compile("\b[A-Z][a-z]*\b").matcher(text);
        while(m.find()) System.out.println(m.group());
    }
}