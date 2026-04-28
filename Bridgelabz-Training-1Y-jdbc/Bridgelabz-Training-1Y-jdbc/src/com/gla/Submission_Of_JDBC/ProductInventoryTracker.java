package src.com.gla.Submission_Of_JDBC;
import java.sql.*;

public class ProductInventoryTracker {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password");

            Statement st = con.createStatement();

            System.out.println("Connected Successfully");

            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
