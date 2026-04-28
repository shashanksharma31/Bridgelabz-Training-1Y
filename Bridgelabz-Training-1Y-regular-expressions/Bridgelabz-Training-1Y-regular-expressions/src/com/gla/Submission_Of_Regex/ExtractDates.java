package src.com.gla.Submission_Of_Regex;
import java.util.regex.*;
public class ExtractDates {
    public static void main(String[] args) {
        String text="12/05/2023 15/08/2024";
        Matcher m=Pattern.compile("\b\d{2}/\d{2}/\d{4}\b").matcher(text);
        while(m.find()) System.out.println(m.group());
    }
}