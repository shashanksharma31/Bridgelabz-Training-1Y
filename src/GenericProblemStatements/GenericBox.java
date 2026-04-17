package GenericProblemStatements;
class Box<T> {
    T value;

    void set(T value){
        this.value = value;
    }
    T get(){
        return value;
    }
}
public class GenericBox {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.set(10);
        System.out.println("Integer value: " + b1.get());

        Box<String> b2 = new Box<>();
        b2.set("Hello");
        System.out.println("String value: " + b2.get());
        Box<Double> b3 = new Box<>();
        b3.set(5.5);
        System.out.println("Double value: " + b3.get());
    }
}