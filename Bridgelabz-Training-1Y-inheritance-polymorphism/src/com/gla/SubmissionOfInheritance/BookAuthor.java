package.src.com.gla.SubmissionOfInheritance;

class Book{String title;int year;}
class Author extends Book{String name;void displayInfo(){System.out.println(title+" "+year+" "+name);}}
public class BookAuthor{public static void main(String[] args){Author a=new Author();a.title="Java";a.year=2020;a.name="James";a.displayInfo();}}