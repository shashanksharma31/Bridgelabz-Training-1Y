package JavaCollection.ScenarioBased;
import java.util.*;
class Students{
    int id;
    String name;
    int marks;
    Students(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public String toString(){
        return id+" "+name+" "+marks;
    }
}
class MeritComparator implements Comparator<Students>{
    public int compare(Students s1,Students s2){
        if(s2.marks==s1.marks){
            return s1.id-s2.id;
        }
        return s2.marks-s1.marks;
    }
}
public class CollegeAdmissionSystem{
    public static void main(String[] args){
        List<Students> list=new ArrayList<>();
        list.add(new Students(1,"Amit",85));
        list.add(new Students(2,"Ravi",40));
        list.add(new Students(3,"Neha",90));
        list.add(new Students(4,"Sita",70));

        Set<Students> shortlisted=new HashSet<>();
        Queue<Students> interviewQueue=new LinkedList<>();
        TreeSet<Students> meritList=new TreeSet<>(new MeritComparator());

        for(Students s:list){
            if(s.marks>=60){
                shortlisted.add(s);
            }
        }

        for(Students s:shortlisted){
            interviewQueue.add(s);
        }

        while(!interviewQueue.isEmpty()){
            Students s=interviewQueue.remove();
            System.out.println("Interviewing: "+s);
            meritList.add(s);
        }

        System.out.println("\nMerit List:");
        for(Students s:meritList){
            System.out.println(s);
        }
    }
}