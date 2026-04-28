package src.com.gla.Stream_API;
import java.util.*;import java.time.*;
class Member{String name;LocalDate expiry;Member(String n,LocalDate e){name=n;expiry=e;}}
public class MembershipFilter{
public static void main(String[] args){
List<Member> list=Arrays.asList(new Member("A",LocalDate.now().plusDays(10)));
list.stream().filter(m->m.expiry.isBefore(LocalDate.now().plusDays(30))).forEach(m->System.out.println(m.name));
}}
