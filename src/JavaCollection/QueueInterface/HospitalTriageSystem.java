package JavaCollection.QueueInterface;
import java.util.*;
class Patient{
    String name;
    int severity;
    Patient(String name,int severity){
        this.name=name;
        this.severity=severity;
    }
}
class PatientComparator implements Comparator<Patient>{
    public int compare(Patient p1,Patient p2){
        return p2.severity-p1.severity;
    }
}
public class HospitalTriageSystem{
    public static void main(String[] args){
        PriorityQueue<Patient> pq=new PriorityQueue<>(new PatientComparator());
        pq.add(new Patient("John",3));
        pq.add(new Patient("Alice",5));
        pq.add(new Patient("Bob",2));
        while(!pq.isEmpty()){
            Patient p=pq.remove();
            System.out.println(p.name);
        }
    }
}