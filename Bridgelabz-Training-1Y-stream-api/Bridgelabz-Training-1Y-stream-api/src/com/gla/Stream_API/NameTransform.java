package src.com.gla.Stream_API;
import java.util.*;
public class NameTransform{
public static void main(String[] args){
List<String> list=Arrays.asList("rahul","amit","sameer");
list.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
}}
