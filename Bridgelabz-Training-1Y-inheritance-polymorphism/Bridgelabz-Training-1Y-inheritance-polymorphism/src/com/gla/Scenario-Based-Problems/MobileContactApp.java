package src.com.gla.Scenario-Based-Problems;

class Contact {
    String name;
    String phoneNumber;

    Contact(String name,String phone) {
        this.name=name;
        this.phoneNumber=phone;
    }

    void display() {
        System.out.println(name+" : "+phoneNumber);
    }
}

class BusinessContact extends Contact {
    String companyName;

    BusinessContact(String name,String phone,String company) {
        super(name,phone);
        companyName=company;
    }

    void display() {
        System.out.println(name.toUpperCase()+" ("+companyName+") : "+phoneNumber);
    }
}

public class MobileContactApp {
    public static void main(String[] args) {
        Contact c1=new Contact("Amit","9876543210");
        c1.display();

        Contact c2=new BusinessContact("Rohit","9999999999","Infosys");
        c2.display();
    }
}
