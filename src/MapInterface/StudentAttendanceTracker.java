package MapInterface;
import java.util.*;

public class StudentAttendanceTracker{
    public static void main(String[] args){

        Map<String,Integer> attendance=new HashMap<>();

        String[] students={"Amit","Ravi","Neha","Sita","Karan"};

        for(String s:students){
            attendance.put(s,0);
        }

        Random r=new Random();

        for(int day=1;day<=15;day++){

            List<String> present=new ArrayList<>();

            for(String s:students){
                if(r.nextBoolean()){
                    present.add(s);
                }
            }

            for(String name:present){
                attendance.put(name,attendance.get(name)+1);
            }
        }

        System.out.println("Attendance Count:");
        for(String name:attendance.keySet()){
            System.out.println(name+" "+attendance.get(name));
        }

        System.out.println("\nUnder attending students (<10 days):");
        for(String name:attendance.keySet()){
            if(attendance.get(name)<10){
                System.out.println(name);
            }
        }
    }
}