package src.com.gla.Submission_Of_Regex;
public class CensorWords {
    public static void main(String[] args) {
        String text="This is damn bad";
        System.out.println(text.replaceAll("damn|bad","****"));
    }
}