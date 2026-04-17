package JavaCollection.ScenarioBased;
import java.util.*;

class Patient{
    int id;
    String name;

    Patient(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int hashCode(){
        return id;
    }

    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(o==null || getClass()!=o.getClass()){
            return false;
        }
        Patient p=(Patient)o;
        return id==p.id;
    }

    public String toString(){
        return id+" "+name;
    }
}

public class HospitalPatientManagementSystem{
    public static void main(String[] args){

        Set<Patient> admitted=new HashSet<>();
        Queue<Patient> waiting=new LinkedList<>();
        Stack<Patient> discharged=new Stack<>();
        List<Patient> history=new ArrayList<>();

        Patient p1=new Patient(1,"Amit");
        Patient p2=new Patient(2,"Ravi");
        Patient p3=new Patient(3,"Neha");
        Patient p4=new Patient(1,"Amit");

        Patient[] arr={p1,p2,p3,p4};

        for(Patient p:arr){
            if(admitted.add(p)){
                waiting.add(p);
                history.add(p);
            }
        }

        while(!waiting.isEmpty()){
            Patient p=waiting.remove();
            System.out.println("Treating: "+p);
            discharged.push(p);
        }

        if(!discharged.isEmpty()){
            Patient p=discharged.pop();
            System.out.println("Re-admitting: "+p);
            waiting.add(p);
        }

        System.out.println("\nPatient History:");
        for(Patient p:history){
            System.out.println(p);
        }
    }
}