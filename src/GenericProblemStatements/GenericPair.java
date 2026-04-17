package GenericProblemStatements;
class Pair<T,U>{
    T first;
    U second;

    Pair(T first,U second){
        this.first=first;
        this.second=second;
    }

    T getFirst(){
        return first;
    }

    U getSecond(){
        return second;
    }
}
public class GenericPair {
    public static void main(String[] args) {

        Pair<String,Integer> student = new Pair<>("Amol",20);
        System.out.println("First value: " + student.getFirst());
        System.out.println("Second value: " + student.getSecond());
    }
}