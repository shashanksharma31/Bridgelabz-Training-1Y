package src.com.gla.Stream_API;
import java.util.*;
class Movie{String name;double rating;int year;Movie(String n,double r,int y){name=n;rating=r;year=y;}}
public class TopMovies{
public static void main(String[] args){
List<Movie> list=Arrays.asList(new Movie("A",4.5,2020),new Movie("B",4.8,2022));
list.stream().sorted((m1,m2)->Double.compare(m2.rating,m1.rating)).limit(2).forEach(m->System.out.println(m.name));
}}
