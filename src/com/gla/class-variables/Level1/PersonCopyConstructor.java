package src.com.gla.classes-variables.Level1;


// Program 3: Copy constructor example
public class PersonCopyConstructor {

    String name;
    int age;

    PersonCopyConstructor(String name,int age){
        this.name=name;
        this.age=age;
    }

    // Copy constructor
    PersonCopyConstructor(PersonCopyConstructor p){
        this.name=p.name;
        this.age=p.age;
    }

    void display(){
        System.out.println(name+" "+age);
    }

    public static void main(String[] args){
        PersonCopyConstructor p1=new PersonCopyConstructor("Rahul",22);
        PersonCopyConstructor p2=new PersonCopyConstructor(p1);

        p1.display();
        p2.display();
    }
}
