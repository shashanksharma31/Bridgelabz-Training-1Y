package src.com.gla.classes-objects.package-assignment;


// Program 9: Access modifier example
class Base{

    public void publicMethod(){
        System.out.println("Public Method");
    }

    protected void protectedMethod(){
        System.out.println("Protected Method");
    }

    void defaultMethod(){
        System.out.println("Default Method");
    }

    private void privateMethod(){
        System.out.println("Private Method");
    }
}

class Derived extends Base{
    void test(){
        publicMethod();
        protectedMethod();
        defaultMethod();
    }
}

public class AccessModifierDemo{
    public static void main(String[] args){

        Derived d = new Derived();
        d.test();
    }
}
