package MapInterface;
import java.util.*;

public class EmployeeSalaryDirectory{
    public static void main(String[] args){

        Map<String,Double> map=new HashMap<>();

        map.put("Amit",50000.0);
        map.put("Ravi",60000.0);
        map.put("Neha",55000.0);
        map.put("Sita",70000.0);
        map.put("Karan",65000.0);
        map.put("Pooja",45000.0);

        String raiseEmp="Ravi";
        double percent=10;

        if(map.containsKey(raiseEmp)){
            double sal=map.get(raiseEmp);
            sal=sal+(sal*percent/100);
            map.put(raiseEmp,sal);
        }else{
            System.out.println("Employee not found");
        }

        String raiseEmp2="Sita";
        double percent2=15;

        if(map.containsKey(raiseEmp2)){
            double sal=map.get(raiseEmp2);
            sal=sal+(sal*percent2/100);
            map.put(raiseEmp2,sal);
        }else{
            System.out.println("Employee not found");
        }

        double sum=0;
        for(String name:map.keySet()){
            sum=sum+map.get(name);
        }

        double avg=sum/map.size();

        System.out.println("Average Salary: "+avg);

        double max=0;
        for(String name:map.keySet()){
            if(map.get(name)>max){
                max=map.get(name);
            }
        }

        System.out.println("\nHighest Paid Employees:");
        for(String name:map.keySet()){
            if(map.get(name)==max){
                System.out.println(name+" "+map.get(name));
            }
        }
    }
}