package src.com.gla.Submission_Of_Regex;
import java.util.regex.*;
public class ExtractLinks {
    public static void main(String[] args) {
        String text="https://google.com http://test.com";
        Matcher m=Pattern.compile("https?://\S+").matcher(text);
        while(m.find()) System.out.println(m.group());
    }
}