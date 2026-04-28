package src.com.gla.Submission_Of_Regex;
public class ReplaceSpaces {
    public static void main(String[] args) {
        String text="This   is   test";
        System.out.println(text.replaceAll("\s+"," "));
    }
}