package src.com.gla.classes-objects.package-assignment;


// Program 7: Student performance analyzer
class StudentData{
    String name="Ravi";
    int m1=80;
    int m2=75;
    int m3=90;
}

class Analyzer{
    double calculateAverage(StudentData s){
        return (s.m1 + s.m2 + s.m3)/3.0;
    }

    String findGrade(double avg){
        if(avg>=85) return "A";
        else if(avg>=70) return "B";
        else return "C";
    }
}

public class StudentPerformanceAnalyzer{
    public static void main(String[] args){

        StudentData s = new StudentData();
        Analyzer a = new Analyzer();

        double avg = a.calculateAverage(s);
        String grade = a.findGrade(avg);

        System.out.println("Student: " + s.name);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}
