package src.com.gla.Submission_Of_Regex;
import java.util.regex.*;
public class RepeatingWords {
    public static void main(String[] args) {
        String text="is is repeated repeated";
        Matcher m=Pattern.compile("\b(\w+)\s+\1\b").matcher(text);
        while(m.find()) System.out.println(m.group(1));
    }
}