package src.com.gla.classes-objects.package-assignment;


// Program 10: Company analytics example
class SalesReport{
    void showSales(){
        System.out.println("Sales Report: North Region - 1M");
    }
}

class EmployeeReport{
    void showEmployees(){
        System.out.println("Employee Performance Report Generated");
    }
}

public class CompanyAnalyticsReport{
    public static void main(String[] args){

        SalesReport s = new SalesReport();
        EmployeeReport e = new EmployeeReport();

        s.showSales();
        e.showEmployees();
    }
}
