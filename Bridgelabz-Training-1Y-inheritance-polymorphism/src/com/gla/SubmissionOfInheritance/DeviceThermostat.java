package.src.com.gla.SubmissionOfInheritance;

class Device{int id;String status;}
class Thermostat extends Device{int temp;void display(){System.out.println(temp+" "+status);}}
public class DeviceThermostat{public static void main(String[] args){Thermostat t=new Thermostat();t.temp=25;t.status="ON";t.display();}}