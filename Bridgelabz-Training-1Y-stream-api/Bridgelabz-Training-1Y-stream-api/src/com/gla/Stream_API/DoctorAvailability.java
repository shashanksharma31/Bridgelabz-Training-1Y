package src.com.gla.Stream_API;
import java.util.*;
class Doctor{String name,day;Doctor(String n,String d){name=n;day=d;}}
public class DoctorAvailability{
public static void main(String[] args){
List<Doctor> list=Arrays.asList(new Doctor("A","Sunday"),new Doctor("B","Monday"));
list.stream().filter(d->d.day.equals("Sunday")).forEach(d->System.out.println(d.name));
}}
