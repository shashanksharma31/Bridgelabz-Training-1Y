package.src.com.gla.SubmissionOfInheritance;

class Order{int id;}
class ShippedOrder extends Order{}
class DeliveredOrder extends ShippedOrder{void status(){System.out.println("Delivered");}}
public class OrderHierarchy{public static void main(String[] args){DeliveredOrder d=new DeliveredOrder();d.status();}}