package src.com.gla.Stream_API;
import java.util.*;import java.util.stream.*;
class Claim{String type;double amount;Claim(String t,double a){type=t;amount=a;}}
public class ClaimAnalysis{
public static void main(String[] args){
List<Claim> list=Arrays.asList(new Claim("Health",1000),new Claim("Health",2000));
System.out.println(list.stream().collect(Collectors.groupingBy(c->c.type,Collectors.averagingDouble(c->c.amount))));
}}
