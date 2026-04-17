package MapInterface;
import java.util.*;

class Employee{
    String name;
    String dept;

    Employee(String name,String dept){
        this.name=name;
        this.dept=dept;
    }

    public String toString(){
        return name;
    }
}

class GroupUtil{
    static Map<String,List<Employee>> groupByDept(List<Employee> list){
        Map<String,List<Employee>> map=new HashMap<>();

        for(Employee e:list){
            if(!map.containsKey(e.dept)){
                map.put(e.dept,new ArrayList<>());
            }
            map.get(e.dept).add(e);
        }

        return map;
    }
}

public class GroupObjectsByProperty{
    public static void main(String[] args){

        List<Employee> list=new ArrayList<>();
        list.add(new Employee("Alice","HR"));
        list.add(new Employee("Bob","IT"));
        list.add(new Employee("Carol","HR"));

        System.out.println(GroupUtil.groupByDept(list));
    }
}