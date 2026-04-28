package src.com.gla.Submission_Of_Regex;
public class ValidateIP {
    public static void main(String[] args) {
        String ip="192.168.1.1";
        System.out.println(ip.matches("^(\d{1,3}\.){3}\d{1,3}$"));
    }
}