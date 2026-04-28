package src.com.gla.Submission_Of_Regex;
import java.util.regex.*;
public class ExtractLanguages {
    public static void main(String[] args) {
        String text="Java Python Go";
        Matcher m=Pattern.compile("Java|Python|Go").matcher(text);
        while(m.find()) System.out.println(m.group());
    }
}