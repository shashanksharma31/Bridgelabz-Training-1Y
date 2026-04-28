package.src.com.gla.SubmissionOfInheritance;

interface Worker{void performDuties();}
class Chef implements Worker{public void performDuties(){System.out.println("Cooking");}}
class Waiter implements Worker{public void performDuties(){System.out.println("Serving");}}
public class RestaurantHybrid{public static void main(String[] args){Worker w=new Chef();w.performDuties();}}